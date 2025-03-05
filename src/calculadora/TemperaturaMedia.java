public class TemperaturaMedia {
    public static void main(String[] args) {
        double[] temperaturas = {22.5, 24.0, 21.5, 23.0, 25.5, 26.0, 22.0};

        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }
        double media = soma / temperaturas.length;
        System.out.println("A temperatura média da semana foi: " + media + " graus Celsius.");
    }
}
