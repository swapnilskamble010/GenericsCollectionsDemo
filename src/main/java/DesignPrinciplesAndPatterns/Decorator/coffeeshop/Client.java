package DesignPrinciplesAndPatterns.Decorator.coffeeshop;

public class Client {
    static void main() {
        Beverage b = new Decaf();
        System.out.println(b.getCost());
        b.getDescription();

        Beverage b1 = new ChocoChip(new Milk(b));
        System.out.println(b1.getCost());
        b1.getDescription();
        b1 = new Soy(b1);
        b1 = new ChocoChip(b1);
        System.out.println(b1.getCost());
        b1.getDescription();
    }
}
