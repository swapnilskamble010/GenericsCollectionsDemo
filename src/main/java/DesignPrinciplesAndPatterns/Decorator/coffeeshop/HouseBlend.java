package DesignPrinciplesAndPatterns.Decorator.coffeeshop;

public class HouseBlend extends Beverage {

    @Override
    public int getCost() {
        return 45;
    }

    @Override
    public void getDescription() {
        System.out.println("House Blend");
    }
}
