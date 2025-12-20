package DesignPrinciplesAndPatterns.Strategy.googlemap;

public class GoogleMap {
    public void findPath(String source, String destination, String mode) {
        PathCalculator pc = PathCalculatorFactory.createPathCalculator(mode);
        pc.findPath(source, destination);
    }
}
