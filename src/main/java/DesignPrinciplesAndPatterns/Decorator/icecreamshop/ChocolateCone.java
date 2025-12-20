package DesignPrinciplesAndPatterns.Decorator.icecreamshop;

public class ChocolateCone implements IceCreamIngredients {
    private int cost = 30;
    private String description = "Chocolate Cone";

    IceCreamIngredients iCecreamIngredients;
    public ChocolateCone(IceCreamIngredients iCecreamIngredients) {
        this.iCecreamIngredients = iCecreamIngredients;
    }

    public ChocolateCone() {

    }

    @Override
    public String getDescription() {
        if(iCecreamIngredients == null) {
            return description;
        }
        return description + " " + iCecreamIngredients.getDescription();
    }

    @Override
    public int getCost() {
        if(iCecreamIngredients == null) {
            return cost;
        }
        return iCecreamIngredients.getCost()+cost;
    }
}
