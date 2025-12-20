package DesignPrinciplesAndPatterns.Observer.amazon;

public class SellerSubscriber implements Subscriber {

    public SellerSubscriber() {
        Amazon.registerSubscriber(this);
    }

    @Override
    public void onOrderPlaced() {
        System.out.println("Seller subscriber invoked");
    }
}
