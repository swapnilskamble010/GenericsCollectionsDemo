package DesignPrinciplesAndPatterns.Observer.amazon;


public class InventorySubscriber implements Subscriber {

    public InventorySubscriber() {
        Amazon.registerSubscriber(this);
    }

    @Override
    public void onOrderPlaced() {
        System.out.println("Inventory subscriber invoked");
    }
}
