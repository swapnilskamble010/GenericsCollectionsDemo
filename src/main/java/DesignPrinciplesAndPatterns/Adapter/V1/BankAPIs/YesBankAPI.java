package DesignPrinciplesAndPatterns.Adapter.V1.BankAPIs;

public class YesBankAPI {
    public int getBalance(){
        System.out.println("Yes Bank checking balance");
        return 100;
    }

    public void transfer(int amount){
        System.out.println("Money transferred via Yes Bank");
    }
}
