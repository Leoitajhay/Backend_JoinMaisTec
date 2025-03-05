package aulaJava;

import java.util.Scanner;

public class Extincao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] Animais = {"Elefante","cavalo","piranha","unicornio","camarão"};


        System.out.println("Digite o nome de um animal que buscaremos em nossos dados se ele esta em extinção: ");
        String nome = input.nextLine();


        if (nome.equalsIgnoreCase("Elefante")) {
            System.out.print("EXTINÇÃO, o Dumbo corre perigo!");
        } else if (nome.equalsIgnoreCase("cavalo")) {
            System.out.print("EXTINÇÃO, O Spirite corre perigo!");
        } else if (nome.equalsIgnoreCase("piranha")) {
            System.out.print("EXTINÇÃO, A sequencia de filmes de piranha acabou!");
        } else if (nome.equalsIgnoreCase("unicornio")) {
            System.out.print("EXTINÇÃO, A Little Ponei corre perigo!");

        } else if (nome.equalsIgnoreCase("camarão")) {
            System.out.print("EXTINÇÃO, O Crill corre perigo!");
        }

    }
}
