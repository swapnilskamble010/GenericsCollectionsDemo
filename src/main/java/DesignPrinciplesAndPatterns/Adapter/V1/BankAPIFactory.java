package DesignPrinciplesAndPatterns.Adapter.V1;

import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIAdapter.ICICIBankAdapter;
import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIAdapter.YesBankAdapter;

public class BankAPIFactory {
    public static BankAPI getBankAPIByName(String bankName) {
        BankAPI bankAPI = null;
        if (bankName.equalsIgnoreCase("ICICI")) {
            bankAPI = new ICICIBankAdapter();
        } else if (bankName.equalsIgnoreCase("YesBank")) {
            bankAPI = new YesBankAdapter();
        }
        else {
            throw new IllegalArgumentException("Bank name not found");
        }
        return bankAPI;
    }
}
