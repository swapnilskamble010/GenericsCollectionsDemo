package DesignPrinciplesAndPatterns.Strategy.googlemap;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Google Maps!\nPlease chose the mode of travel: ");
        String mode = scanner.nextLine();
        GoogleMap googleMap = new GoogleMap();
        googleMap.findPath("Delhi", "Mumbai", mode);
    }
}
