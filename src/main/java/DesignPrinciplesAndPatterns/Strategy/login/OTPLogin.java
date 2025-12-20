package DesignPrinciplesAndPatterns.Strategy.login;

public class OTPLogin implements LoginStrategy {

    @Override
    public void login() {
        System.out.println("Login in via OTP");
    }
}
