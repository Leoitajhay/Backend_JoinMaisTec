package aulaJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Reciclavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> categorias = new ArrayList<>();

        System.out.println("Bem-vindo ao cadastramento de produtos recicláveis!");
        System.out.println("Favor digite até no máximo 5 produtos para o cadastro:\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do produto ou digite (sair) para finalizar o cadastro:");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            categorias.add(entrada);
        }


        System.out.println("\nProdutos recicláveis cadastrados:");
        for (String categoria : categorias) {
            System.out.println("- " + categoria);
        }

        sc.close();
    }
}
