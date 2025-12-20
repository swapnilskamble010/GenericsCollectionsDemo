package DesignPrinciplesAndPatterns.Observer.amazon;

public class EmailSubscriber implements Subscriber {

    public EmailSubscriber() {
        Amazon.registerSubscriber(this);
    }

    @Override
    public void onOrderPlaced() {
        System.out.println("Email subscriber invoked");
    }
}
