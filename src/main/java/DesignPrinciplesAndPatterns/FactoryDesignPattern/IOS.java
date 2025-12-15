package DesignPrinciplesAndPatterns.FactoryDesignPattern;

import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Button.Button;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Button.IOSButton;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Dropdown.Dropdown;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Dropdown.IOSDropdown;

public class IOS extends Platform {

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
