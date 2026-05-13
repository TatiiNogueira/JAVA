public class ProdutoAlimentar extends Produto {

    public ProdutoAlimentar(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrar() {
        System.out.println("Alimentar: " + nome + " | Preço: " + preco);
    }
}