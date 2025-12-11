package DesignPrinciplesAndPatterns.SingletonPattern.v1;

public class DBconnectionPoolV1 {
    private static DBconnectionPoolV1 instance;
    private DBconnectionPoolV1(){

    }
    public static DBconnectionPoolV1 getInstance(){
        return instance = new DBconnectionPoolV1();
    }
}
