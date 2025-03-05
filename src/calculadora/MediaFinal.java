package calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.List;
public class MediaFinal{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite a seguir suas 3 notas do semestre \n");
            System.out.print("Digite nota 1: ");
            double nota1= scanner.nextDouble();


            System.out.print("Digite nota 2: ");
            double nota2= scanner.nextDouble();

            System.out.print("Digite nota 3: ");
            double nota3= scanner.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("Sua média final é: " + df.format(media));
        }
    }

}

