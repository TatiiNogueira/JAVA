public class Carro extends Veiculo {

    private int numeroPortas;

    //Construtor
    public Carro(String marca, Double velocidadeInicial, int numeroPortas) {
        super(marca, velocidadeInicial);
        this.numeroPortas = numeroPortas;
    }

    //Metodo subscito
    @Override
    public void tipo() {
        System.out.println("Sou um Carro");
    }
}
