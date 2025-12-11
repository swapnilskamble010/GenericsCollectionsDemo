package DesignPrinciplesAndPatterns.SingletonPattern.v4;

public class DBconnectionPoolV4 {
    private static DBconnectionPoolV4 instance = null;
    private DBconnectionPoolV4(){

    }
    synchronized public static DBconnectionPoolV4 getInstance(){
        if(instance == null){
            instance = new DBconnectionPoolV4();
        }
        return instance;
    }
}
