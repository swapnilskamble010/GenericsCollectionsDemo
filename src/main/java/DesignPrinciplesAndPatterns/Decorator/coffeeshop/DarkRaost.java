package DesignPrinciplesAndPatterns.Decorator.coffeeshop;

public class DarkRaost extends Beverage {
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public void getDescription() {
        System.out.println("Dark Raost");
    }
}
