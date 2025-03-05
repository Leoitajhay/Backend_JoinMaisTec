package calculadora;

import java.util.Scanner;
public class CalculadoraPaPg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o valor inicial: ");
                int valorInicial = scanner.nextInt();


                System.out.print("Digite o valor da raiz: ");
                int raiz = scanner.nextInt();


                System.out.print("Deseja calcular os 10 primeiros valores de uma P.A. ou de uma P.G.? (Digite 'PA' ou 'PG'): ");
                String escolha = scanner.next();


                if (escolha.equalsIgnoreCase("PA")) {
                    System.out.println("Os 10 primeiros valores da P.A. são:");
                    for (int i = 0; i < 10; i++) {
                        int valorPA = valorInicial + i * raiz;
                        System.out.print(valorPA + " ");
                    }
                } else if (escolha.equalsIgnoreCase("PG")) {
                    System.out.println("Os 10 primeiros valores da P.G. são:");
                    for (int i = 0; i < 10; i++) {
                        int valorPG = valorInicial * (int) Math.pow(raiz, i);
                        System.out.print(valorPG + " ");
                    }
                } else {
                    System.out.println("Escolha inválida. Por favor, digite 'PA' ou 'PG'.");
                }

                scanner.close();
            }
        }



