package IntroToMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorld = new HelloWorldPrinter();
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(helloWorld);
        thread.start();
        System.out.println("After creating thread "+Thread.currentThread().getName());
//        for(int i=1;i<=20;i++){
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread thread1 = new Thread(numberPrinter);
//            thread1.start();
//        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for(int i=1;i<=100;i++){
//            if(i==30){
//                System.out.println();
//            }
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            executorService.execute(numberPrinter);
//        }
        for(int i=1;i<=100;i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.submit(numberPrinter);
        }
    }
}
