package DesignPrinciplesAndPatterns.Adapter.V0;

import DesignPrinciplesAndPatterns.Adapter.V0.BankAPIs.YesBankAPI;

public class FastTagRecharge {
    public boolean recharge(int amount, YesBankAPI yesBankAPI){
        if(yesBankAPI.getBalance() >= amount){
            System.out.println("Recharge via Yes Bank successfully");
            return true;
        }
        return false;
    }
}
