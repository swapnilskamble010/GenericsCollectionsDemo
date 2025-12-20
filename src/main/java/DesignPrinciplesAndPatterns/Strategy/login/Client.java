package DesignPrinciplesAndPatterns.Strategy.login;

import java.util.Scanner;

public class Client {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Login Strategy\nPlease let us know your choice of login");
        String choice = scanner.nextLine();
//        LoginStrategy loginStrategy = null;
//        if(choice.equalsIgnoreCase("google")){
//            loginStrategy = new GoogleLogin();
//        } else if(choice.equalsIgnoreCase("OTP")){
//            loginStrategy = new OTPLogin();
//        } else if(choice.equalsIgnoreCase("username")){
//            loginStrategy = new UsernameLogin();
//        }

        LoginStrategy loginStrategy = LoginStrategyFactory.getLoginStrategy(choice);
        loginStrategy.login();
    }
}
