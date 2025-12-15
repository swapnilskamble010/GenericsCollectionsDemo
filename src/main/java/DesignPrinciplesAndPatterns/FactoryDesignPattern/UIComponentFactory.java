package DesignPrinciplesAndPatterns.FactoryDesignPattern;

import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Button.Button;
import DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Dropdown.Dropdown;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
//    Menu createMenu();
}
