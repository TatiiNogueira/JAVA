public class Pessoa {
    // Atributos da classe
    String nomePessoa;
    int idadePessoa;

    // Construtor: inicializa os atributos quando o objeto é criado
    public Pessoa(String nome, int idade){
        nomePessoa = nome;
        idadePessoa = idade;
    }

    // Método para apresentar os dados da pessoa
    public void apresentar(){
        // Em Java usa-se + para juntar texto com variáveis
        System.out.println("A pessoa " + nomePessoa + " tem " + idadePessoa + " anos.");
    }
}