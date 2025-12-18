package DesignPrinciplesAndPatterns.Adapter.V0.BankAPIs;

public class ICICIBankAPI {
    public int balanceCheck(){
        System.out.println("ICICI Bank is checking the balance");
        return 100;
    }

    public void moneyTransfer(int amount){
        System.out.println("Money transfer via Yes Bank");
    }
}
