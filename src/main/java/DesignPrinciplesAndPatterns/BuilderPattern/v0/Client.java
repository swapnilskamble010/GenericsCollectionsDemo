package DesignPrinciplesAndPatterns.BuilderPattern.v0;


public class Client {
    public static void main(String[] args) {

        SoldItemBuilder soldItemBuilderv0 = new SoldItemBuilder();
        soldItemBuilderv0.setId(1);
        soldItemBuilderv0.setName("Sold Item");
        soldItemBuilderv0.setQuantity(10);
        soldItemBuilderv0.setPrice(50);
        soldItemBuilderv0.setDiscount(10);
        soldItemBuilderv0.setPrime(true);

        SoldItem soldItem = new SoldItem(soldItemBuilderv0);
    }
}
