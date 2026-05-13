import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ========================
        // Exemplo inicial (nota)
        // ========================
        int nota = 15;

        if (nota < 10) {
            System.out.println("Negativa");
        } else if (nota <= 19) {
            System.out.println("Positiva");
        } else if (nota == 20) {
            System.out.println("Perfeito");
        } else {
            System.out.println("Nota inválida");
        }

        // ========================
        // Nível 1
        // ========================
        int numero1 = 32;
        if (numero1 > 10) {
            System.out.println("Maior que 10");
        }

        int numero2 = -6;
        if (numero2 >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        // ========================
        // Nível 2
        // ========================
        int idade1 = 17;
        if (idade1 >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        int numero3 = 7;
        if (numero3 % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        // ========================
        // Nível 3
        // ========================

        int a1 = 10;
        int b1 = 20;

        if (a1 > b1) {
            System.out.println("O maior é: " + a1);
        } else {
            System.out.println("O maior é: " + b1);
        }

        int a2 = 5;
        int b2 = 5;

        if (a2 == b2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");
        }

        // ========================
        // Nível 4
        // ========================

        int nota2 = 16;

        if (nota2 >= 19) {
            System.out.println("Excelente");
        } else if (nota2 >= 15) {
            System.out.println("Bom");
        } else if (nota2 >= 10) {
            System.out.println("Regular");
        } else {
            System.out.println("Insuficiente");
        }

        // ========================
        // Nível 5
        // ========================

        int nota1 = 12;
        int nota3 = 14;

        double media = (nota1 + nota3) / 2.0;

        if (media >= 10) {
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }

        int idade2 = 25;

        if (idade2 < 12) {
            System.out.println("Criança");
        } else if (idade2 < 18) {
            System.out.println("Jovem");
        } else {
            System.out.println("Adulto");
        }

        Scanner scanner = new Scanner(System.in);

        // Ler os dois números
        System.out.print("Introduz o primeiro número: ");
        int valor1 = scanner.nextInt();

        System.out.print("Introduz o segundo número: ");
        int valor2 = scanner.nextInt();

        // Verifica qual é o maior ou se são iguais
        if (valor1 > valor2) {
            System.out.println("O maior número é: " + valor1);
        } else if (valor2 > valor1) {
            System.out.println("O maior número é: " + valor2);
        } else {
            System.out.println("Os números são iguais");
        }

        scanner.close();
    }
}