package DesignPrinciplesAndPatterns.Adapter.V0;

import DesignPrinciplesAndPatterns.Adapter.V0.BankAPIs.YesBankAPI;

public class PhonePeLoan {
    public boolean checkLoanEligibility(int amount, YesBankAPI yesBankAPI){
        // Loan will be given if you have 10% of the loan amount in your bank
        if(yesBankAPI.getBalance() >= (0.10*amount)){
            System.out.println("Loan Eligible");
            return true;
        }
        return false;
    }
}
