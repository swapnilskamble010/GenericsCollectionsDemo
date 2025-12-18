package DesignPrinciplesAndPatterns.Adapter.V1;

import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIs.YesBankAPI;

public class FastTagRecharge {
    public boolean recharge(int amount, BankAPI bankAPI){
        if(bankAPI.checkBalance() >= amount){
            System.out.println("Recharge via "+ bankAPI+ " successfully");
            return true;
        }
        return false;
    }
}
