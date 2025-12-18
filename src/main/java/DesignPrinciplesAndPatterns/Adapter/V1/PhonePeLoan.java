package DesignPrinciplesAndPatterns.Adapter.V1;

import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIs.YesBankAPI;

public class PhonePeLoan {
    public boolean checkLoanEligibility(int amount, BankAPI bankAPI){
        // Loan will be given if you have 10% of the loan amount in your bank
        if(bankAPI.checkBalance() >= (0.10*amount)){
            System.out.println("Loan Eligible");
            return true;
        }
        return false;
    }
}
