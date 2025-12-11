package DesignPrinciplesAndPatterns.SingletonPattern;

import DesignPrinciplesAndPatterns.SingletonPattern.v0.DBconnectionPoolV0;
import DesignPrinciplesAndPatterns.SingletonPattern.v1.DBconnectionPoolV1;
import DesignPrinciplesAndPatterns.SingletonPattern.v2.DBconnectionPoolV2;
import DesignPrinciplesAndPatterns.SingletonPattern.v3.DBconnectionPoolV3;
import DesignPrinciplesAndPatterns.SingletonPattern.v4.DBconnectionPoolV4;
import DesignPrinciplesAndPatterns.SingletonPattern.v5.DBconnectionPoolV5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SingltonClient {
    public static void main(String[] args) {
        //simple class v0
        DBconnectionPoolV0 v00 = new DBconnectionPoolV0();
        DBconnectionPoolV0 v01 = new DBconnectionPoolV0();
        System.out.println(v00.hashCode()+" "+v01.hashCode());
        System.out.println("*********************");
        //v1
        DBconnectionPoolV1 v10 = DBconnectionPoolV1.getInstance();
        DBconnectionPoolV1 v11 = DBconnectionPoolV1.getInstance();
        System.out.println(v10.hashCode()+" "+v11.hashCode());
        System.out.println("*********************");
        //v2 - singlton but issue in multithreaded environment
        DBconnectionPoolV2 v21 = DBconnectionPoolV2.getInstance();
        DBconnectionPoolV2 v22 = DBconnectionPoolV2.getInstance();
        System.out.println(v21.hashCode()+" "+v22.hashCode());
        System.out.println("*********************");
        //v3 - eager
        DBconnectionPoolV3 v31 = DBconnectionPoolV3.getInstance();
        DBconnectionPoolV3 v32 = DBconnectionPoolV3.getInstance();
        System.out.println(v31.hashCode()+" "+v32.hashCode());
        System.out.println("*********************");
        //v4 lazy with synchronized method
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 10; i++){
            executor.submit(()->{
                DBconnectionPoolV4 v4 = DBconnectionPoolV4.getInstance();
                System.out.println("Got instance: "+ v4.hashCode()+" from "+ Thread.currentThread().getName());
            });
        }
        executor.shutdown();
//        Thread t1 = new Thread(()->{
//            DBconnectionPoolV4 v41 = DBconnectionPoolV4.getInstance();
//            System.out.println(v41+" ");
//        });
//        Thread t2 = new Thread(()->{
//            DBconnectionPoolV4 v42 = DBconnectionPoolV4.getInstance();
//            System.out.println(v42+" ");
//        });
//        t1.start();
//        t2.start();
        System.out.println("*********************");
        //v5 lazy with double check lock
        ExecutorService executor1 = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 10; i++){
            executor1.submit(()->{
                DBconnectionPoolV5 v5 = DBconnectionPoolV5.getInstance();
                System.out.println("Got instance: "+ v5.hashCode()+" from "+ Thread.currentThread().getName());
            });
        }
        executor1.shutdown();
        System.out.println("*********************");
    }
}
