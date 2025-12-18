package DesignPrinciplesAndPatterns.Adapter.V1;

import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIAdapter.ICICIBankAdapter;
import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIAdapter.YesBankAdapter;

public class PhonePe {
    private FastTagRecharge fastTagRecharge;
    private PhonePeLoan phonePeLoan;
    private BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.fastTagRecharge = new FastTagRecharge();
        this.phonePeLoan = new PhonePeLoan();
        this.bankAPI = bankAPI;
    }

    public boolean rechargeFastTag(int amount){
        return fastTagRecharge.recharge(amount, bankAPI);
    }

    public boolean availLoan(int amount){
        if(phonePeLoan.checkLoanEligibility(amount, bankAPI)){
            System.out.println("Lets disburse the loan");
            return true;
        } else {
            System.out.println("Sorry you don't have enough money");
        }
        return false;
    }

}
