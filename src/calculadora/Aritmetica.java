package calculadora;

import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo à Calculadora!\n");

        System.out.println("Digite o primeiro valor: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a operação que deseja ( * , + , - ou /): ");
        String opera = scanner.next();

        double resultado = 0;
        boolean continua = true;

        if (opera.equals("+")) {
            resultado = num1 + num2;
        } else if (opera.equals("-")) {
            resultado = num1 - num2;
        } else if (opera.equals("*")) {
            resultado = num1 * num2;
        } else if (opera.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
                continua = false;
            }
        } else {
            System.out.println("Erro: Operação inválida.");
            continua = false;
        }

        if (continua) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
