package DesignPrinciplesAndPatterns.FactoryDesignPattern;

import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Button.AndroidButton;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Button.Button;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Button.IOSButton;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Dropdown.AndroidDropdown;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Dropdown.Dropdown;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Dropdown.IOSDropdown;

public class Client {
    public static void main(String[] args) {
        Platform platform = new Android();
        //Bases on platform, we want to create new buttons
        Button button = null;
        if(platform instanceof Android){
            button = new AndroidButton();
        } else if(platform instanceof IOS){
            button = new IOSButton();
        }
        button.click();

        Dropdown dropdown = null;
        if(platform instanceof Android){
            dropdown = new AndroidDropdown();
        } else if(platform instanceof IOS){
            dropdown = new IOSDropdown();
        }
        dropdown.showOptions();
    }
}
