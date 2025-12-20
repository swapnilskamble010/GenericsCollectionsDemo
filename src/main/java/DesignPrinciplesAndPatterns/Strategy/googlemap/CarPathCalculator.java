package DesignPrinciplesAndPatterns.Strategy.googlemap;

public class CarPathCalculator implements PathCalculator {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding CAR path from " + source + " to " + destination);
    }
}
