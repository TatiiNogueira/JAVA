import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Variáveis para o Nível 1
        Integer a = 125;
        Integer b = 254;

        // =========================
        // NÍVEL 1
        // =========================
        System.out.println("=== NÍVEL 1 ===");
        System.out.println("Soma: " + (a + b));
        System.out.println("Utilizando .equals(): " + (a.equals(b)));

        // =========================
        // NÍVEL 2
        // =========================
        System.out.println("\n=== NÍVEL 2 ===");
        Casa casa1 = new Casa("Amarela", 3, true);
        Casa casa2 = new Casa("Azul", 5, false);

        int comparacao = casa1.getQuartos().compareTo(casa2.getQuartos());
        System.out.println(comparacao < 0 ? "A Azul é maior." : "A Amarela é maior.");

        // =========================
        // NÍVEL 3 e 4
        // =========================
        System.out.println("\n=== NÍVEL 3 e 4 ===");
        Casa[] listaDeCasasArray = {
                new Casa("Branca", 2, true),
                new Casa("Verde", 4, false),
                new Casa("Vermelha", 6, true)
        };

        Integer totalQuartos = 0;
        for (Casa c : listaDeCasasArray) {
            totalQuartos += c.getQuartos();
            System.out.println("Casa " + c.getCor() + ": " + c.getQuartos() + " quartos.");
        }
        System.out.println("Total acumulado: " + totalQuartos);

        // =========================
        // NÍVEL 5
        // =========================
        System.out.println("\n=== NÍVEL 5 ===");
        List<Casa> listaDeCasas = new ArrayList<>();
        listaDeCasas.add(new Casa("Branco", 3, true));
        listaDeCasas.add(new Casa("Azul", 64, true));

        listaDeCasas.sort(Comparator.comparing(Casa::getQuartos));
        System.out.println("Primeira casa da lista ordenada: " + listaDeCasas.get(0).getCor());

        // =========================
        // NÍVEL 6 - DESAFIO SCANNER
        // =========================
        System.out.println("\n=== NÍVEL 6 (Interativo) ===");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduza a cor de uma nova casa: ");
        String corUser = teclado.next();
        System.out.print("Número de quartos: ");
        Integer quartosUser = teclado.nextInt();

        Casa casaUser = new Casa(corUser, quartosUser, true);
        System.out.println("Casa registada com sucesso!");

        // =========================================================
        // NÍVEL 7 - TESTE DE MÉTODOS (Chamada via Classe Casa)
        // =========================================================
        System.out.println("\n=== NÍVEL 7 (Resultados) ===");

        // ATENÇÃO: Agora usamos Casa.maiorCasa() porque o método é static na classe Casa
        Casa vencedora = Casa.maiorCasa(casa1, casa2);
        System.out.println("Entre a " + casa1.getCor() + " e a " + casa2.getCor() + ", a maior é: " + vencedora.getCor());

        Boolean iguais = Casa.saoIguais(casa1, casa2);
        System.out.println("As casas são iguais em quartos? " + iguais);

        teclado.close();
    }
}