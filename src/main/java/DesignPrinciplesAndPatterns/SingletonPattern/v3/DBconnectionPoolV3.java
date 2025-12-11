package DesignPrinciplesAndPatterns.SingletonPattern.v3;

public class DBconnectionPoolV3 {
    private static DBconnectionPoolV3 instance = new DBconnectionPoolV3();
    private DBconnectionPoolV3(){

    }
    public static DBconnectionPoolV3 getInstance(){
        return instance;
    }
}
