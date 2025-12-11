package DesignPrinciplesAndPatterns.SingletonPattern.v5;

public class DBconnectionPoolV5 {
    private static DBconnectionPoolV5 instance = null;
    private DBconnectionPoolV5(){

    }
    public static DBconnectionPoolV5 getInstance(){
        if(instance == null){
            synchronized (DBconnectionPoolV5.class){
                if(instance == null){
                    instance = new DBconnectionPoolV5();
                }
            }
        }
        return instance;
    }
}
