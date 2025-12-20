package DesignPrinciplesAndPatterns.Strategy.login;

public class GoogleLogin implements LoginStrategy {
    @Override
    public void login() {
        System.out.println("Login in via Google");
    }
}
