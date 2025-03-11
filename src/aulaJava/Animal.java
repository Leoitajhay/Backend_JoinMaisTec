package aulaJava;

public class Animal {

    private String nome;
    private String habitat;
    private String som;
    private String tipoDeAlimentacao;


    public Animal(String nome, String habitat, String som, String tipoDeAlimentacao) {
        this.nome = nome;
        this.habitat = habitat;
        this.som = som;
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }


    public void mover() {
        System.out.println(nome + " está se movendo em seu habitat: " + habitat + ".");
    }


    public void emitirSom() {
        System.out.println(nome + " está emitindo o som: " + som + ".");
    }


    public void alimentar() {
        if (tipoDeAlimentacao.equalsIgnoreCase("Herbívoro")) {
            System.out.println(nome + " está se alimentando de plantas.");
        } else if (tipoDeAlimentacao.equalsIgnoreCase("Carnívoro")) {
            System.out.println(nome + " está se alimentando de carne.");
        } else {
            System.out.println("Tipo de alimentação desconhecido para " + nome + ".");
        }
    }


    public static void main(String[] args) {

        Animal leao = new Animal("Leão", "Savana", "Rugido", "Carnívoro");
        Animal elefante = new Animal("Elefante", "Floresta", "Trumpete", "Herbívoro");


        leao.emitirSom();
        leao.alimentar();

        System.out.println();

        elefante.mover();
        elefante.emitirSom();
        elefante.alimentar();
    }
}
