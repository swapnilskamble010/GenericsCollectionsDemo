package DesignPrinciplesAndPatterns.Decorator.icecreamshop;

public class ChocolateSyrup implements IceCreamIngredients {
    private int cost = 15;
    private String description = "Chocolate Syrup";
    IceCreamIngredients iceCreamIngredients;

    public ChocolateSyrup(IceCreamIngredients iceCreamIngredients) {
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

