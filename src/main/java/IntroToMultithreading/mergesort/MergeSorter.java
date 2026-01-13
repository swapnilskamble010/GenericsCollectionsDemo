package IntroToMultithreading.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> listToSort;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> listToSort, ExecutorService executorService) {
        this.listToSort = listToSort;
        this.executorService = executorService;
    }


    @Override
    public List<Integer> call() throws Exception {
        //logic of merge sort
        int n = listToSort.size();
        if(n<=1){
            return listToSort;
        }
        //Divide the list into two halves
        List<Integer> firstHalf = listToSort.subList(0,n/2);
        List<Integer> secondHalf = listToSort.subList(n/2,n);

        //sort first half and second half recursively in a separate thread
        MergeSorter leftMergeSorter = new MergeSorter(firstHalf, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(secondHalf, executorService);

//        Thread leftThread = new Thread(leftMergeSorter); //we use executor service instead we shouldn't create thread as we want
//        Thread rightThread = new Thread(rightMergeSorter);

        //Instead of creating a new ExecutorService object everytime, we can use the one passed in the constructor
//        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<List<Integer>> leftSortedListFuture = executorService.submit(leftMergeSorter);    //non-blocking call
        Future<List<Integer>>  rightSortedListFuture = executorService.submit(rightMergeSorter); //non-blocking call

        //merge leftSortedList and rightSortedList sorted list
        List<Integer> leftSortedList = leftSortedListFuture.get(); //Blocking call
        List<Integer> rightSortedList = rightSortedListFuture.get(); //Blocking call

        int i = 0, j = 0;
        List<Integer> finalSortedList = new ArrayList<>();
        while(i < leftSortedList.size() && j < rightSortedList.size()){
            if(leftSortedList.get(i)<rightSortedList.get(j)){
                finalSortedList.add(leftSortedList.get(i));
                i++;
            } else {
                finalSortedList.add(rightSortedList.get(j));
                j++;
            }
        }

        while(i < leftSortedList.size()){
            finalSortedList.add(leftSortedList.get(i));
            i++;
        }

        while(j < rightSortedList.size()){
            finalSortedList.add(rightSortedList.get(j));
            j++;
        }

        return finalSortedList;
    }
}
