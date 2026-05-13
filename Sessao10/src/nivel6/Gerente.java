package nivel6;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public void calcularPagamento() {
        double total = getSalarioBase() + bonus;
        System.out.println("Gerente: " + getNome() + " | Pagamento (com bónus): " + total + "€");
    }
}
