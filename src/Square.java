//2. Classe Quadrado: Crie uma classe que modele um quadrado:
//
//Atributos: Tamanho do lado
//Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular
//        Área;
public class Square {
    private int sideSize = 4;

    public Square() {}
    public Square(int sideSize) {
        this.sideSize = sideSize;
    }
    //Retornar valor do Lado
    public int getSideSize() {
        return sideSize;
    }
    //Mudar valor do Lado
    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }
    public double area(int sideSize){
        return sideSize*sideSize;
    }
    public String toString() {
        return "{Side Size=" + sideSize + ", Area=" + area(sideSize) + "}";
    }
}
