public class Main {
    public static void main() {
        // ========================
        // Nível 1
        // ========================
        int num1 = 12;

        // Maior que 10
        if (num1 > 10) {
            System.out.println("Maior que 10");
        }
        // Igual a 5
        else if (num1 == 5) {
            System.out.println("Igual a 5");
        }

        // Par ou ímpar
        if (num1 % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        int idade = 17;

        // Maior de idade
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Menor que 0
        if (num1 < 0) {
            System.out.println("Número negativo");
        }

        // ========================
        // Nível 2
        // ========================

        int num2 = -5;

        // Positivo ou negativo
        if (num2 >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        int nota = 14;

        // Aprovado ou reprovado
        if (nota >= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // Maior que 10 ou menor/igual
        if (num2 > 10) {
            System.out.println("Maior que 10");
        } else {
            System.out.println("Menor ou igual a 10");
        }

        int a = 10;
        int b = 20;

        // Mostrar o maior
        if (a > b) {
            System.out.println("Maior: " + a);
        } else {
            System.out.println("Maior: " + b);
        }

        // ========================
        // Nível 3
        // ========================

        int num3 = 0;

        // Negativo, zero ou positivo
        if (num3 < 0) {
            System.out.println("Negativo");
        } else if (num3 == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positivo");
        }

        int idade2 = 20;

        // Menor ou maior de idade
        if (idade2 >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        int nota2 = 8;

        // Negativa ou positiva
        if (nota2 < 10) {
            System.out.println("Negativa");
        } else {
            System.out.println("Positiva");
        }

        // ========================
        // Nível 4
        // ========================

        int x = 15;
        int y = 15;

        // Iguais ou mostrar maior
        if (x == y) {
            System.out.println("Números iguais");
        } else if (x > y) {
            System.out.println("Maior: " + x);
        } else {
            System.out.println("Maior: " + y);
        }

        int num4 = 9;

        // Par ou ímpar
        if (num4 % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        int temperatura = 23;

        // Frio ou quente
        if (temperatura < 15) {
            System.out.println("Frio");
        } else {
            System.out.println("Quente");
        }
    }
}