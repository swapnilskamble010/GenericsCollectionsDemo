package DesignPrinciplesAndPatterns.Strategy.login;

public class UsernameLogin implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("Login in via Username");
    }
}
