package aulaJava;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class FrequenciaCardiaca {

    private String nome;
    private String sobrenome;
    private LocalDate dataDeNascimento;


    public FrequenciaCardiaca(String nome, String sobrenome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
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

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }


    public int calcularIdade() {
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }


    public int calcularFrequenciaMaxima() {
        return 220 - calcularIdade();
    }


    public String calcularFrequenciaAlvo() {
        int freqMaxima = calcularFrequenciaMaxima();
        int alvoMinimo = (int) (freqMaxima * 0.50); // 50% da frequência máxima
        int alvoMaximo = (int) (freqMaxima * 0.85); // 85% da frequência máxima
        return alvoMinimo + " - " + alvoMaximo + " bpm";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua data de nascimento (formato: AAAA-MM-DD):");
        String dataNascStr = scanner.nextLine();
        LocalDate dataDeNascimento = LocalDate.parse(dataNascStr);


        FrequenciaCardiaca pessoa = new FrequenciaCardiaca(nome, sobrenome, dataDeNascimento);


        System.out.println("\nInformações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Data de Nascimento: " + pessoa.getDataDeNascimento());
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + pessoa.calcularFrequenciaMaxima() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + pessoa.calcularFrequenciaAlvo());
    }
}
