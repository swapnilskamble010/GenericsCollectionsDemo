package DesignPrinciplesAndPatterns.Strategy.googlemap;

public class WalkPathCalculator implements PathCalculator {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding WALING path from " + source + " to " + destination);
    }
}
