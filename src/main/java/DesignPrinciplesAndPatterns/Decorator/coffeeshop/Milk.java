package DesignPrinciplesAndPatterns.Decorator.coffeeshop;

public class Milk extends Addon {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Milk");
    }

    @Override
    public int getCost() {
        return 5+beverage.getCost();
    }
}
