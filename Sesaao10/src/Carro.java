public class Carro extends Veiculo {
    public Carro(String marca){
        super(marca);
    }

    @Override
    public void mostrarMarca() {
        System.out.println("A Marca é " + getMarca());
    }
}
