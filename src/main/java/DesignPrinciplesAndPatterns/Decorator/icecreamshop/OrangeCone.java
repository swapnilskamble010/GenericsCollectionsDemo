package DesignPrinciplesAndPatterns.Decorator.icecreamshop;


public class OrangeCone implements IceCreamIngredients {
    private int cost = 25;
    private String description = "Orange Cone";

    IceCreamIngredients iceCreamIngredients;
    public OrangeCone(IceCreamIngredients iceCreamIngredients) {
        this.iceCreamIngredients = iceCreamIngredients;
    }

    public OrangeCone() {

    }

    @Override
    public String getDescription() {
        if(iceCreamIngredients == null){
            return description;
        }
        return description+" "+iceCreamIngredients.getDescription();
    }

    @Override
    public int getCost() {
        if(iceCreamIngredients == null){
            return cost;
        }
        return iceCreamIngredients.getCost()+cost;
    }
}
