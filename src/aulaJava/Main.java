package aulaJava;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu sobre Sobrenome: ");
            String sobreNome = scanner.nextLine();

            System.out.print("Digite seu sobre nome: ");
            String nome = scanner.nextLine();

            System.out.println("Olá "+ nome + " " + sobreNome + "!");
        }

    }
}






