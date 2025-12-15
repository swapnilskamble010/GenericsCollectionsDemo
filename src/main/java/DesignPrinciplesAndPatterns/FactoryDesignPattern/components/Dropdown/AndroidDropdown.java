package DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Dropdown;

public class AndroidDropdown implements Dropdown {
    @Override
    public void showOptions() {
        System.out.println("Options from AndroidDropdown");
    }
}
