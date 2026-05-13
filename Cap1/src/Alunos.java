public class Alunos {
    // Atributos da classe (características do aluno)
    String nome;
    int _idade;
    String morada;

    // Construtor da classe: inicializa os atributos quando o objeto é criado
    public Alunos(String nome, int idade, String morada){
        this.nome = nome;       // Atribui o nome recebido ao atributo da classe
        _idade = idade;     // Atribui a idade recebida ao atributo da classe
        this.morada = morada;   // Atribui a morada recebida ao atributo da classe
    }

    // Método para apresentar o aluno (imprime os dados no ecrã)
    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + _idade);
        System.out.println("Morada: " + morada);
    }

    // Método toString(): devolve uma representação em texto do objeto
    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", idade=" + _idade +
                ", morada='" + morada + '\'' +
                '}';
    }
}