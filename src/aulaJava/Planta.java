package aulaJava;

public class Planta {

    private String nome;
    private String tipo;
    private double necessidadeDeAgua;


    public Planta(String nome, String tipo, double necessidadeDeAgua) {
        this.nome = nome;
        this.tipo = tipo;
        this.necessidadeDeAgua = necessidadeDeAgua;
    }


    public double calcularNecessidadeDeAgua(int qtdSemanas, double area) {
        return necessidadeDeAgua * qtdSemanas * area;
    }


    public void irrigar() {
        System.out.println("A planta " + nome + " foi irrigada com sucesso!");
    }


    public void exibirInformacoes() {
        System.out.println("Nome da Planta: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Necessidade de Água por semana (por m²): " + necessidadeDeAgua + " litros");
    }


    public static void main(String[] args) {

        Planta tomate = new Planta("Tomate", "horta", 5.0);


        tomate.exibirInformacoes();


        int semanas = 4;
        double area = 10.0;
        double aguaNecessaria = tomate.calcularNecessidadeDeAgua(semanas, area);

        System.out.println("\nQuantidade de água necessária para " + semanas + " semanas em " + area + " m²: " + aguaNecessaria + " litros.");


        tomate.irrigar();
    }
}
