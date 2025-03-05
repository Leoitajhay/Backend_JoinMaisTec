package calculadora;


import java.util.Scanner;
import java.util.List;
public class imc {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();
            System.out.print("Digite seu peso: ");
            double peso = scanner.nextDouble();
            System.out.println( "seu IMC é: " + peso/( altura * altura));
        }

    }
}
