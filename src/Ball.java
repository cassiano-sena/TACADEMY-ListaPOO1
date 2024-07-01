//1. Classe Bola: Crie uma classe que modele uma bola:
//Atributos: Cor, circunferência, material
//Métodos: trocaCor e mostrarDados

public class Ball {
    private String color;
    private double circumference;
    private String material;

    public Ball() {}
    public Ball(String color, double circumference, String material) {
        this.color = color;
        this.circumference = circumference;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    // método trocaCor
    public void setColor(String color) {
        this.color = color;
    }

    public double getCircumference() {
        return circumference;
    }
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    // método mostrarDados
    public String toString() {
        return "{Color: " + color + ", Circumference: " + circumference + ", Material: " + material + "}";
    }
}
