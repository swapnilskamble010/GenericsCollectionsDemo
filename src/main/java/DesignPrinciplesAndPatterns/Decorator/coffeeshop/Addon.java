package DesignPrinciplesAndPatterns.Decorator.coffeeshop;

public abstract class Addon extends Beverage{
    protected Beverage beverage;
    public Addon(Beverage beverage) {
        this.beverage = beverage;
    }
}
