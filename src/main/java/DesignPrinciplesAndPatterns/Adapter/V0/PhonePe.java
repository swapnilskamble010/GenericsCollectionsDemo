package DesignPrinciplesAndPatterns.Adapter.V0;

import DesignPrinciplesAndPatterns.Adapter.V0.BankAPIs.YesBankAPI;

public class PhonePe {
    private FastTagRecharge fastTagRecharge;
    private PhonePeLoan phonePeLoan;
    private YesBankAPI yesBankAPI;
    public PhonePe(){
        fastTagRecharge = new FastTagRecharge();
        phonePeLoan = new PhonePeLoan();
        yesBankAPI = new YesBankAPI();
    }

    public boolean rechargeFastTag(int amount){
        return fastTagRecharge.recharge(amount, yesBankAPI);
    }

    public boolean availLoan(int amount){
        if(phonePeLoan.checkLoanEligibility(amount, yesBankAPI)){
            System.out.println("Lets disburse the loan");
            return true;
        } else {
            System.out.println("Sorry you don't have enough money");
        }
        return false;
    }

}
