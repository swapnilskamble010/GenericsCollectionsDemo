package DesignPrinciplesAndPatterns.FactoryDesignPattern;

import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Button.Button;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Dropdown.Dropdown;
import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String platformName = scanner.nextLine();

        Platform platform = PlatformFactory.getPlatformByName(platformName);

//        if(platformName.equals("Android")){
//            platform = new Android();
//        } else if(platformName.equals("iOS")){
//            platform = new IOS();
//        } else {
//            throw new IllegalArgumentException("Platform name not valid, please select Android or iOS");
//        }
        //Bases on platform we first create factory
        UIComponentFactory componentFactory = platform.createUIComponentFactory();

        Button button = componentFactory.createButton();
        button.click();

        Dropdown dropdown = componentFactory.createDropdown();
        dropdown.showOptions();

        //Option 2: Move if-else to a dedicated class
    }
}
