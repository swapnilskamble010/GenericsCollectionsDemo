package DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Button;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("Click in IOSButton");
    }
}
