package calculadora;

import java.util.Scanner;
import java.util.Random;

public class AdivinheUmNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random(); // Inicialização do gerador de números aleatórios

        System.out.println("Jogo de Adivinhação, está preparado?\n");

        int numDado = gerador.nextInt(5) + 1; // Gera um número aleatório entre 1 e 5
        int num1 = 0;

        while (num1 != numDado) {
            System.out.println("Digite um número de 1 a 5 que verei se você acertou: ");
            num1 = scanner.nextInt();

            if (num1 == numDado) {
                System.out.println("Parabéns, você acertou!");
            } else {
                System.out.println("Errou, tente novamente.");
            }
        }

        scanner.close();
    }
}
