package aulaJava;

import java.util.Scanner;
import java.util.ArrayList;

public class Roteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> rota = new ArrayList<>();

        System.out.println("Seja Bem Vindo!\n");
        System.out.println("Digite as paradas que deseja adicionar para o seu roteiro:");
        System.out.println("Quando terminar, digite 'salvar' para imprimir seu roteiro! \n");


        while (true) {
            String roteiro = scanner.nextLine();

            if (roteiro.equalsIgnoreCase("salvar")) {
                System.out.println("\nAqui está seu roteiro de paradas, boa viagem: " + rota);
                break;
            } else {
                rota.add(roteiro);
            }
        }


        System.out.println("\nDeseja adicionar mais paradas em posições específicas?");
        System.out.println("Digite 'sim' para continuar ou 'não' para encerrar o programa.");

        String resposta = scanner.nextLine();

        while (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite o índice onde deseja inserir a nova parada (0 para o início, " + rota.size() + " para o final):");
            int indice = scanner.nextInt();
            scanner.nextLine();

            if (indice < 0 || indice > rota.size()) {
                System.out.println("Índice inválido. Por favor, tente novamente.");
                continue;
            }

            System.out.println("Digite o nome da nova parada:");
            String novaParada = scanner.nextLine();

            rota.add(indice, novaParada);

            System.out.println("\nRoteiro atualizado: " + rota);
            System.out.println("Deseja adicionar mais paradas? (Digite 'sim' para continuar ou 'não' para encerrar.)");
            resposta = scanner.nextLine();
        }

        System.out.println("\nRoteiro final: " + rota);
        System.out.println("Boa viagem!");
    }
}
