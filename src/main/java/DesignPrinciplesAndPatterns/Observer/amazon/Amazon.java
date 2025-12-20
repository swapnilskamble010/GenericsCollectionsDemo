package DesignPrinciplesAndPatterns.Observer.amazon;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private static List<Subscriber> ops = new ArrayList<>();

    public static void registerSubscriber(Subscriber subscriber) {
        ops.add(subscriber);
    }

    public static void unregisterSubscriber(Subscriber subscriber) {
        ops.remove(subscriber);
    }

    public void notifyOrderPlaced() {
        for(Subscriber s : ops){
            s.onOrderPlaced();
        }
    }
}
