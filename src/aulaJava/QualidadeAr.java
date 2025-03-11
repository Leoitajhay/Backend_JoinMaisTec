package aulaJava;


import java.util.Scanner;
public class QualidadeAr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bem vindo ao verificador de qualidade de ar:\n");
        String [] cidades = {"Joinville","São Paulo","Curitiba","Rio De Janeiro","Porto Alegre"};
        int[] indicesDePoluicao = {23,140,903,110,99};



    for (int i = 0; i < cidades.length; i++) {
        if (indicesDePoluicao[i] >= 100) {
        System.out.print("A cidade de" + " " + cidades[i] + " " +"esta com  indice de poluição do ar acima de 100. \n");
    }}

    }
}
