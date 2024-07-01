import java.util.Scanner;

public class PlaceCalculator {

    public PlaceCalculator(){}

    public void PlaceCalculation(){
        double placeLength;
        double placeWidth;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nThis is an algorithm for calculation of flooring and footing of a place.");
        System.out.println("Input length and width of the place:");
        System.out.println("Length (m2): ");
        placeLength = scanner.nextDouble();
        System.out.println("Width (m2): ");
        placeWidth = scanner.nextDouble();

        System.out.println("Calculating...");
        Rectangle place = new Rectangle(placeLength, placeWidth);
        System.out.println("Considering the flooring and footing is 1 meter squared");
        System.out.println("Flooring: " + place.getArea());
        System.out.println("Footing: " + place.getPerimeter());
    }
}
