package DesignPrinciplesAndPatterns.Adapter.V1.BankAPIAdapter;

import DesignPrinciplesAndPatterns.Adapter.V1.BankAPI;
import DesignPrinciplesAndPatterns.Adapter.V1.BankAPIs.YesBankAPI;

public class YesBankAdapter implements BankAPI {
    private YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public int checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void transferMoney(int amount) {
        yesBankAPI.transfer(amount);
    }
}
