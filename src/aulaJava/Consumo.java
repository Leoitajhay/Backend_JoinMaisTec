package aulaJava;

import java.util.Scanner;
import java.util.ArrayList;
public class Consumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> gasto = new ArrayList<>();

        System.out.print("Consumo Dos últimos 4 meses");

        gasto.add(100); //ADICIONA O (100) NA LISTA GASTO//
        gasto.add(100);
        gasto.add(150);
        gasto.add(60);

        System.out.print(gasto);

        double soma = 0;
        for (int i = 0; i < gasto.size(); i++) {
            soma += gasto.get(i);

        }

        double media = soma / gasto.size();
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media + "kw");

        if (media > 100) {
            System.out.print("Você esta como o consumo acima de 100kw");
        }
    }
}