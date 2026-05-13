public class Main {
    public static void main(){
        // Criar um objeto Animal
        Animal animal1 = new Animal();
        animal1.nome = "Rufus";
        animal1.tipo = "Cão";

        // Mostrar no ecrã
        animal1.fazerSom();

        // Criar um objeto Produto
        Produto produto1 = new Produto();
        produto1.nome = "Mala";
        produto1.preco = 52.52;

        // Mostrar no ecrã
        produto1.mostrarProduto();

        // Criar um objeto Filme
        Filme filme1 = new Filme();
        filme1.titulo = "Romeo e Julieta";
        filme1.ano = 2001;

        // Mostrar no ecrã
        filme1.mostrarFilme();
    }
}
