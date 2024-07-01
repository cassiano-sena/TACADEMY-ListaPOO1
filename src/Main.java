public class Main {
    public static void main(String[] args) {

        // Classe Ball(Bola)
        System.out.println("Class: Ball");
        Ball ball1 = new Ball("Black",10.5, "Carbon");
        Ball ball2 = new Ball("White",6.7, "Ceramic");

        System.out.println("Ball1: " + ball1);
        System.out.println("Ball2: " + ball2);

        ball1.setColor("Blue");
        System.out.println("Ball1: " + ball1);
        System.out.println("\n");

        //Classe Square(Quadrado)
        System.out.println("Class: Square");
        Square square1 = new Square();
        Square square2 = new Square(10);

        System.out.println("Square1: " + square1);
        System.out.println("Square2: " + square2);

        square1.getSideSize();
        square2.setSideSize(20);
        System.out.println("Square1: " + square1);
        System.out.println("Square2: " + square2);
        System.out.println("\n");

        PlaceCalculator placeCalculator = new PlaceCalculator();
        placeCalculator.PlaceCalculation();
    }

}