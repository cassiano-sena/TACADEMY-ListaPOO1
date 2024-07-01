//4. Classe Massa Corporal:
//O IMC – Índice de Massa Corporal é um critério da Organização Mundial de
//Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A
//fórmula é IMC = peso / (altura):
//Elabore uma classe que leia o peso e a altura de um adulto e mostre sua
//condição de acordo com a tabela abaixo.
//IMC em adultos Condição
//-Abaixo de 18,5 Abaixo do peso
//-Entre 18,5 e 25 Peso normal
//-Entre 25 e 30 Acima do peso
//-Acima de 30 obeso
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("IMC Calculator");
        System.out.print("Enter weight (kg)): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (kg): ");
        double height = scanner.nextDouble();
        double bmi = calculateBMI(weight, height);
        String condition = determineCondition(bmi);
        System.out.printf("IMC: %.2f\n", bmi);
        System.out.println("Condition: " + condition);
        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String determineCondition(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
