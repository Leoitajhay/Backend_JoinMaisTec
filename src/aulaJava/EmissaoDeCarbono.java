package aulaJava;

public class EmissaoDeCarbono {

    private String atividade;
    private double quantidadeEmissao;


    public EmissaoDeCarbono(String atividade, double quantidadeEmissao) {
        this.atividade = atividade;
        this.quantidadeEmissao = quantidadeEmissao;
    }


    public double calcularEmissaoCO2(double minutos) {
        double horas = minutos / 60.0;
        return horas * quantidadeEmissao;
    }


    public void exibirInformacoes() {
        System.out.println("Atividade: " + atividade);
        System.out.println("Emissão por hora: " + quantidadeEmissao + " kg de CO2");
    }


    public static void main(String[] args) {

        EmissaoDeCarbono dirigir = new EmissaoDeCarbono("Dirigir carro a gasolina", 2.31);


        dirigir.exibirInformacoes();


        double minutos = 90;
        double emissaoTotal = dirigir.calcularEmissaoCO2(minutos);

        System.out.println("Tempo de atividade: " + minutos + " minutos");
        System.out.println("Emissão total: " + emissaoTotal + " kg de CO2");
    }
}
