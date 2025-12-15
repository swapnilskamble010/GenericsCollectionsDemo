package DesignPrinciplesAndPatterns.FactoryDesignPattern;

import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Button.Button;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Dropdown.Dropdown;

public abstract class Platform {
    public void setRefreshRate() {
        System.out.println("Refresh Rate");
    }

//    public abstract Button createButton();
    //NO NO NO! HOLD on PLEASE!
//    public abstract Dropdown createDropdown();

    public abstract UIComponentFactory createUIComponentFactory();
}
