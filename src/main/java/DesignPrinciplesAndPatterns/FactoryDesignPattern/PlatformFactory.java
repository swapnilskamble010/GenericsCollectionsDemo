package DesignPrinciplesAndPatterns.FactoryDesignPattern;

public class PlatformFactory {
    public static Platform getPlatformByName(String platformName){
        Platform platform = null;
        if(platformName.equals("Android")){
            platform = new Android();
        } else if(platformName.equals("iOS")){
            platform = new IOS();
        } else {
            throw new IllegalArgumentException("Platform name not valid, please select Android or iOS");
        }
        return platform;
    }
}
