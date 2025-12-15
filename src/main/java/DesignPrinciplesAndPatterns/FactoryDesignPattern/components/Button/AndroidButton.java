package DesignPrinciplesAndPatterns.FactoryDesignPattern.components.Button;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("Click in AndroidButton");
    }
}
