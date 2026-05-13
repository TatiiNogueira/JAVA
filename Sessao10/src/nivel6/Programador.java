package nivel6;

public class Programador extends Funcionario {
    private int horasExtra;

    public Programador(String nome, double salarioBase, int horasExtra) {
        super(nome, salarioBase);
        this.horasExtra = horasExtra;
    }

    @Override
    public void calcularPagamento() {
        // Cada hora extra vale 20€
        double total = getSalarioBase() + (horasExtra * 20);
        System.out.println("Programador: " + getNome() + " | Pagamento (com horas extra): " + total + "€");
    }
}
