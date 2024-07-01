//3. Classe Retangulo: Crie uma classe que modele um retangulo:
//
//Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e
//        Altura, a escolher)
//Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular
//Área e calcular Perímetro;
//Crie um programa que utilize esta classe. Ele deve pedir ao usuário
//que informe as medidades de um local. Depois, deve criar um
//objeto com as medidas e calcular a quantidade de pisos e de
//rodapés necessárias para o local.
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {}
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    //calcular Área
    public double getArea() {
        return length * width;
    }

    //calcular Perímetro
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    //Mudar valor dos lados
    public void setSizes(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Retornar valor dos lados
    public String toString() {
       return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
}
