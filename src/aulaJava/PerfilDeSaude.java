package aulaJava;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PerfilDeSaude {

    private String nome;
    private String sobrenome;
    private String sexo;
    private LocalDate dataDeNascimento;
    private double altura;
    private double peso;


    public PerfilDeSaude(String nome, String sobrenome, String sexo, LocalDate dataDeNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
        this.peso = peso;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public int calcularIdade() {
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }


    public int calcularFrequenciaMaxima() {
        return 220 - calcularIdade();
    }


    public String calcularFrequenciaAlvo() {
        int freqMaxima = calcularFrequenciaMaxima();
        int alvoMinimo = (int) (freqMaxima * 0.50);
        int alvoMaximo = (int) (freqMaxima * 0.85);
        return alvoMinimo + " - " + alvoMaximo + " bpm";
    }


    public double calcularIMC() {
        return peso / (altura * altura);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita informações do usuário
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite seu sexo:");
        String sexo = scanner.nextLine();

        System.out.println("Digite sua data de nascimento (formato: AAAA-MM-DD):");
        String dataNascStr = scanner.nextLine();
        LocalDate dataDeNascimento = LocalDate.parse(dataNascStr);

        System.out.println("Digite sua altura (em metros):");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso (em quilogramas):");
        double peso = scanner.nextDouble();


        PerfilDeSaude pessoa = new PerfilDeSaude(nome, sobrenome, sexo, dataDeNascimento, altura, peso);


        System.out.println("\nInformações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Data de Nascimento: " + pessoa.getDataDeNascimento());
        System.out.println("Altura: " + pessoa.getAltura() + " metros");
        System.out.println("Peso: " + pessoa.getPeso() + " kg");

        System.out.println("\nCálculos:");
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + pessoa.calcularFrequenciaMaxima() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + pessoa.calcularFrequenciaAlvo());
        System.out.println("Índice de Massa Corporal (IMC): " + pessoa.calcularIMC());
    }
}
