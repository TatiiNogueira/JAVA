public class Main {

    public void main(){
        //Nivel 1
        Aluno aluno = new Aluno("Tatiana","JAVA");
        aluno.apresentar();

        //Nivel 2
        Carro carro = new Carro("Ferrari");
        carro.mostrarMarca();

        Mota mota = new Mota("Toyota");
        mota.mostrarMarca();

        // Nivel 3
        Gerente gerente = new Gerente("Carlos", 3000.0);
        Tecnico tecnico = new Tecnico("Ana", 1500.0);

        gerente.apresentar();
        tecnico.apresentar();

        // Nível 4
        Animal a1 = new Gato();
        Animal a2 = new Cao();

        a1.fazerSom();
        a2.fazerSom();

        //nivel 5
        Produto p1 = new ProdutoAlimentar("Arroz", 32.24);
        Produto p2 = new ProdutoEletronico("Livro", 35.21);

        p1.mostrar();
        p2.mostrar();

        //Nivel 6
        Pessoa pessoa = new Aluno("Matilde","SQL");
        pessoa.apresentar();

        Pessoa pessoa2 = new Professor("Carlos");
        pessoa2.apresentar();
    }
}
