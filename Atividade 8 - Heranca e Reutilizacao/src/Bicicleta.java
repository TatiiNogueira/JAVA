public class Bicicleta extends Veiculo {

    private boolean temMudancas;

    //Construtor
    public Bicicleta(String marca, Double velocidadeInicial, Boolean temMudancas) {
        super(marca, velocidadeInicial);
        this.temMudancas = temMudancas;
    }

    //Metodo subscito
    @Override
    public void tipo() {
        System.out.println("Sou uma Bicicleta");
    }

}