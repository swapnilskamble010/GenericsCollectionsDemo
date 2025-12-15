package DesignPrinciplesAndPatterns.FactoryDesignPattern;

import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Button.AndroidButton;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Button.Button;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Dropdown.AndroidDropdown;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Dropdown.Dropdown;

public class AndroidUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
