package DesignPrinciplesAndPatterns.Decorator.icecreamshop;

public class Cherry implements IceCreamIngredients {
    private int cost = 10;
    private String description = "Cherry";
    IceCreamIngredients iceCreamIngredients;

    public Cherry(IceCreamIngredients iceCreamIngredients) {
        this.iceCreamIngredients = iceCreamIngredients;
    }

    @Override
    public String getDescription() {
        return description+" "+iceCreamIngredients.getDescription();
    }

    @Override
    public int getCost() {
        return cost+iceCreamIngredients.getCost();
    }
}
