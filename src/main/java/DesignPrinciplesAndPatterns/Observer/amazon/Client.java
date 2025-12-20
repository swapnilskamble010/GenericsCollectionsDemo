package DesignPrinciplesAndPatterns.Observer.amazon;

public class Client {
    public static void main(String[] args) {
        Subscriber subscriber = new SellerSubscriber();
        Subscriber subscriber1 = new EmailSubscriber();
        Subscriber subscriber2 = new InventorySubscriber();

//        Amazon.registerSubscriber(subscriber);
//        Amazon.registerSubscriber(subscriber1);
//        Amazon.registerSubscriber(subscriber2);

        Amazon.unregisterSubscriber(subscriber);

        Amazon amazon = new Amazon();
        amazon.notifyOrderPlaced();


    }
}
