public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrar() {
        System.out.println("Eletrónico: " + nome + " | Preço: " + preco);
    }
}