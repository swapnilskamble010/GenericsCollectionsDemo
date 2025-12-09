package LambdasAndStreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void doSomething(){
        System.out.println("LambdasAndStreamAPI");
    }
    public static void main(String[] args) {
        Runnable sometask = new SomeTask();
        Thread t = new Thread(sometask);
        t.start();

        Runnable anotherTask = ()->{
            System.out.println("Another task is running");
        };
        Thread t1 = new Thread(anotherTask);
        t1.start();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        Comparator<Integer> comparator = ((o1, o2) -> {
//            if(o1%2 == 0) return -1;
//            else if(o2%2 == 0) return 1;
//            return 0;
//        });
        Collections.sort(numbers, ((o1, o2) -> {
            doSomething();
            if(o1%2 == 0) return -1;
            else if(o2%2 == 0) return 1;
            return 0;
        }));

//        Collections.sort(numbers, comparator);
        //without Lambda function
        Collections.sort(numbers1, new EvenOddComparator());
        System.out.println(numbers);
        System.out.println(numbers1);
    }
}
