public class Calculadora {

    // Método estático para calcular a média de duas notas
    // É estático porque pode ser chamado sem criar um objeto da classe
    public static double calcularMedia(double nota1, double nota2){

        // Cálculo da média aritmética
        double media = (nota1 + nota2) / 2;

        // Devolve o valor da média calculada
        return media;
    }
}