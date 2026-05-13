import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // =========================
        // NÍVEL 1 (básico)
        // =========================
        System.out.println("NÍVEL 1 - Array fixo");
        int[] array1 = {10, 20, 30, 40, 50};

        // Mostrar todos os valores
        System.out.print("Todos os valores: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // Primeiro e último elemento
        System.out.println("Primeiro elemento: " + array1[0]);
        System.out.println("Último elemento: " + array1[array1.length - 1]);

        System.out.println("\n=========================\n");

        // =========================
        // NÍVEL 2, 3 e 4
        // =========================
        System.out.println("NÍVEIS 2, 3 e 4 - Array introduzido pelo utilizador");

        int[] array2 = new int[5];

        // Ler 5 números
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Introduz o número " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
        }

        // Mostrar todos os valores
        System.out.print("\nValores introduzidos: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        // Soma e média
        int soma = 0;
        for (int i = 0; i < array2.length; i++) {
            soma += array2[i];
        }
        double media = (double) soma / array2.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        // Maior e menor
        int maior = array2[0];
        int menor = array2[0];

        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > maior) {
                maior = array2[i];
            }
            if (array2[i] < menor) {
                menor = array2[i];
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        // Contar pares
        int pares = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);

        sc.close();
    }
}