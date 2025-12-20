package DesignPrinciplesAndPatterns.Decorator.icecreamshop;

public class Client {
    static void main() {
        IceCreamIngredients iceCreamIngredients = new Cherry(
                                                    new ChocolateSyrup(
                                                            new OrangeCone(
                                                                    new ChocolateSyrup(
                                                                            new ChocolateCone()
                                                                    )
                                                            )
                                                    )
        );

        System.out.println("Description: " +  iceCreamIngredients.getDescription());
        System.out.println("Cost: " +  iceCreamIngredients.getCost());
    }
}
