package DesignPrinciplesAndPatterns.SingletonPattern.v2;

public class DBconnectionPoolV2 {
    private static DBconnectionPoolV2 instance;
    private DBconnectionPoolV2(){

    }
    public static DBconnectionPoolV2 getInstance(){
        if(instance == null){
            instance = new DBconnectionPoolV2();
        }
        return instance;
    }
}
