package DesignPrinciplesAndPatterns.BuilderPattern.v1;

public class Client {
    public static void main(String[] args) {

//        SoldItemBuilder soldItemBuilder = new SoldItemBuilder();
        SoldItem soldItem =
                SoldItem
                        .getSoldItemBuilder()
                        .setId(1)
                        .setName("Sold Item")
                        .setPrice(100.0)
                        .setQuantity(10)
                        .setDiscount(0.2)
                        .setPrime(true)
                        .build();

//        soldItemBuilder.setId(1);
//        soldItemBuilder.setName("Sold Item");
//        soldItemBuilder.setQuantity(10);
//        soldItemBuilder.setPrice(50);
//        soldItemBuilder.setDiscount(10);
//        soldItemBuilder.setPrime(true);

//        SoldItem soldItem = new SoldItem(soldItemBuilder);
    }
}
