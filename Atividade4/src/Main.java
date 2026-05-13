import java.util.Scanner;

public class Main {

    public static void main(){
        Scanner sc = new Scanner(System.in);
        int[] numeros = {6, 23, 51, 536, 24, 25};
        int[] numeros2 = new int[6];

        // Ler valores
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros2[i] = sc.nextInt();
        }

        // =========================
        // NÍVEL 1
        // =========================
        System.out.println("-------------------Nivel 1-------------------");

        // Mostrar todos os valores
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Segundo elemento
        System.out.println("Segundo elemento: " + numeros[1]);

        // Penúltimo elemento
        System.out.println("Penúltimo elemento: " + numeros[numeros.length - 2]);

        // Contar maiores que 10
        int count = 0;
        for (int n : numeros) {
            if (n > 10) {
                count++;
            }
        }
        System.out.println("Maiores que 10: " + count);

        // =========================
        // NÍVEL 2
        // =========================
        System.out.println("-------------------Nivel 2-------------------");

        // Pares
        System.out.print("Pares: ");
        for (int n : numeros2) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        // Ímpares
        System.out.print("Ímpares: ");
        for (int n : numeros2) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        // Negativos
        int negativos = 0;
        for (int n : numeros2) {
            if (n < 0) {
                negativos++;
            }
        }
        System.out.println("Negativos: " + negativos);

        // =========================
        // NÍVEL 3
        // =========================
        System.out.println("-------------------Nivel 3-------------------");

        int max = numeros[0];
        int min = numeros[0];

        for (int n : numeros) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Diferença: " + (max - min));

        // Verificar se existe 10
        boolean existe = false;
        for (int n : numeros) {
            if (n == 10) {
                existe = true;
                break;
            }
        }

        System.out.println(existe ? "Existe" : "Não existe");

        // Contar iguais ao primeiro
        int count3 = 0;
        for (int n : numeros) {
            if (n == numeros[0]) {
                count3++;
            }
        }

        System.out.println("Iguais ao primeiro: " + count3);

        // =========================
        // NÍVEL 4
        // =========================
        System.out.println("-------------------Nivel 4-------------------");

        int[] numeros4 = {3, -4, -5, 3, 5567, 23};

        // Dobro
        int[] dobro = new int[numeros4.length];
        for (int i = 0; i < numeros4.length; i++) {
            dobro[i] = numeros4[i] * 2;
            System.out.print(dobro[i] + " ");
        }
        System.out.println();

        // Mostrar invertido
        System.out.print("Invertido: ");
        for (int i = numeros4.length - 1; i >= 0; i--) {
            System.out.print(numeros4[i] + " ");
        }
        System.out.println();

        // Substituir negativos por 0
        for (int i = 0; i < numeros4.length; i++) {
            if (numeros4[i] < 0) {
                numeros4[i] = 0;
            }
        }

        System.out.print("Sem negativos: ");
        for (int n : numeros4) {
            System.out.print(n + " ");
        }

        // =========================
        // NÍVEL 5
        // =========================
        System.out.println("\n-------------------Nivel 5-------------------");

        int soma = 0, pares = 0;
        int max5 = numeros[0], min5 = numeros[0];

        System.out.print("Valores: ");
        for (int n : numeros) {
            System.out.print(n + " ");
            soma += n;

            if (n % 2 == 0) pares++;
            if (n > max5) max5 = n;
            if (n < min5) min5 = n;
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Maior: " + max5);
        System.out.println("Menor: " + min5);
        System.out.println("Pares: " + pares);

        // Invertido
        System.out.print("Invertido: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        // =========================
        // EXTRA
        // =========================
        System.out.println("\n-------------------Extra-------------------");

        boolean ordenado = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                ordenado = false;
                break;
            }
        }

        System.out.println(ordenado ? "Ordenado" : "Desordenado");
        sc.close();
    }
}
