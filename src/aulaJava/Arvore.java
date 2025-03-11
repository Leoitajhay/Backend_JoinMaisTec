package aulaJava;

public class Arvore {

    private String nome;
    private String tipo;
    private double altura;


    public Arvore(String nome, String tipo, double altura) {
        this.nome = nome;
        this.tipo = tipo;
        this.altura = altura;
    }


    public void exibirInformacoes() {
        System.out.println("Nome da Árvore: " + nome);
        System.out.println("Tipo da Árvore: " + tipo);
        System.out.println("Altura da Árvore: " + altura + " metros");
    }


    public double calcularOxigenio() {
        return altura * 10;
    }


    public static void main(String[] args) {

        Arvore minhaArvore = new Arvore("Pine Tree", "Conífera", 15.5);


        minhaArvore.exibirInformacoes();


        double oxigenio = minhaArvore.calcularOxigenio();
        System.out.println("Oxigênio produzido por dia: " + oxigenio + " gramas");
    }
}
