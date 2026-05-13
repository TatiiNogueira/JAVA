public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarDado(){
        System.out.println("O produto " + nome + " custa " + preco);
    }
}
