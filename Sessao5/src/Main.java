import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================
        // NÍVEL 1 (BÁSICO)
        // =========================

        // Mostrar números de 1 a 10
        System.out.println("Números de 1 a 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Mostrar números de 10 até 1
        System.out.println("\nNúmeros de 10 até 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Mostrar números pares até 20
        System.out.println("\nNúmeros pares até 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        // =========================
        // NÍVEL 2 (INTERMÉDIO)
        // =========================

        // Calcular soma de 1 a 10
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        System.out.println("\nSoma de 1 a 10: " + soma);

        // Tabuada de um número
        System.out.print("\nIntroduza um número para a tabuada: ");
        int numero = input.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Contar números positivos
        int positivos = 0;
        System.out.println("\nIntroduza 5 números:");
        for (int i = 1; i <= 5; i++) {
            int num = input.nextInt();
            if (num > 0) {
                positivos++;
            }
        }
        System.out.println("Quantidade de números positivos: " + positivos);


        // =========================
        // NÍVEL 3 (APLICAÇÃO)
        // =========================

        // Média de 5 números
        int somaMedia = 0;
        System.out.println("\nIntroduza 5 números para calcular a média:");
        for (int i = 1; i <= 5; i++) {
            somaMedia += input.nextInt();
        }
        double media = somaMedia / 5.0;
        System.out.println("Média: " + media);

        // Maior número
        int maior = Integer.MIN_VALUE;
        System.out.println("\nIntroduza 5 números para encontrar o maior:");
        for (int i = 1; i <= 5; i++) {
            int num = input.nextInt();
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("Maior número: " + maior);

        // Contar números pares
        int pares = 0;
        System.out.println("\nIntroduza 5 números para contar os pares:");
        for (int i = 1; i <= 5; i++) {
            int num = input.nextInt();
            if (num % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Quantidade de números pares: " + pares);


        // =========================
        // NÍVEL 4 (DESAFIO)
        // =========================

        int somaTotal = 0;
        int valor;

        System.out.println("\nIntroduza números (0 para terminar):");
        valor = input.nextInt();

        // Ciclo while até o utilizador inserir 0
        while (valor != 0) {
            somaTotal += valor;
            valor = input.nextInt();
        }

        System.out.println("Soma total: " + somaTotal);


        // =========================
        // NÍVEL 5 (DESAFIO EXTRA) - do...while
        // =========================

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Primeiro número: ");
                    int a = input.nextInt();
                    System.out.print("Segundo número: ");
                    int b = input.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;

                case 2:
                    System.out.print("Primeiro número: ");
                    int c = input.nextInt();
                    System.out.print("Segundo número: ");
                    int d = input.nextInt();
                    System.out.println("Resultado: " + (c - d));
                    break;

                case 3:
                    System.out.println("A sair...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        // =========================
        // NÍVEL 6 (com switch)
        // =========================
        int numeroSecreto = 7;
        int tentar = 0;

        System.out.println("Tenta adivinhar o número (entre 1 e 10):");

        while (tentar != numeroSecreto) {
            System.out.print("Introduz um número: ");
            tentar = input.nextInt();

            switch (tentar) {
                case 7:
                    System.out.println("Parabéns! Acertaste no número!");
                    break;
                default:
                    if (tentar < numeroSecreto) {
                        System.out.println("Muito baixo! Tenta outra vez.");
                    } else {
                        System.out.println("Muito alto! Tenta outra vez.");
                    }
                    break;
            }
        }
        input.close();
    }
}