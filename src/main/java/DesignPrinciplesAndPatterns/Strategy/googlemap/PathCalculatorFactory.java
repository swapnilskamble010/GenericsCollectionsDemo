package DesignPrinciplesAndPatterns.Strategy.googlemap;


public class PathCalculatorFactory {
    public static PathCalculator createPathCalculator(String mode){
        PathCalculator path = null;
        if(mode.equalsIgnoreCase("CAR")){
            path = new CarPathCalculator();
        } else if(mode.equalsIgnoreCase("WALK")){
            path = new WalkPathCalculator();
        } else {
            System.out.println("Unknown mode");
            throw new IllegalArgumentException(mode+"- mode not supported");
        }
        return path;
    }
}
