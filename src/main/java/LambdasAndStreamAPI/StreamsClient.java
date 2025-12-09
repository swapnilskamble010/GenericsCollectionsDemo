package LambdasAndStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClient {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 5, 6, 7, 8, 9, 4, 4, 10);
        List<Integer> evenNumbers = new ArrayList<>();
        for(Integer number : numbers) {
            if(number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Even numbers using regular method are: " + evenNumbers);

        //using stream
        //filter
        Stream<Integer> streamList = numbers.stream();
        List<Integer> evenElementList =
                streamList.filter((element)->{
                    if(element % 2 == 0) {  return true;}
                    return false;
                }
                ).collect(Collectors.toList());
        System.out.println("Even elements using lambda method are: " + evenElementList);

        //map
        List<Integer> squares =
                numbers.stream().map((element) ->{
                    return element*element;
                }).collect(Collectors.toList());
        System.out.println("Squares using lambda method are: " + squares);

        List<Integer> finalOutput =
                numbers.stream()
                        .filter((element)->{
                            if(element % 2 == 0) {  return true;}
                            return false;
                        })
                        .map((element)->{
                            return element*element;
                        })
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println("Final output using lambda method are: " + finalOutput);

        List<Integer> finalOutput2 =
                numbers.stream()
                        .filter(element->element%2==0)
                        .map(element -> element*element)
                        .sorted()
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println("Final output2 using lambda method are: " + finalOutput2);

        System.out.println("********* Advantage *************");
        Optional<Integer> ans =
                numbers.stream()
                .filter((element) -> {
                    System.out.println("Filtering: " + element);
                    if(element % 2 == 0) {  return true;}
                    return false;
                })
                .map((element) -> {
                    System.out.println("Mapping: " + element);
                    return element*element;
                })
                .distinct()
                .findFirst();
        if(ans.isPresent()) {
            System.out.println("First Number from Final Output: " + ans.get());
        }
    }
}
