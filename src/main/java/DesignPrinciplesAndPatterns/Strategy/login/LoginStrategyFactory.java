package DesignPrinciplesAndPatterns.Strategy.login;

public class LoginStrategyFactory {
    public static LoginStrategy getLoginStrategy(String loginType) {
        LoginStrategy loginStrategy = null;
        if(loginType.equalsIgnoreCase("google")){
            loginStrategy = new GoogleLogin();
        } else if(loginType.equalsIgnoreCase("OTP")){
            loginStrategy = new OTPLogin();
        } else if(loginType.equalsIgnoreCase("username")){
            loginStrategy = new UsernameLogin();
        }
        return loginStrategy;
    }
}
