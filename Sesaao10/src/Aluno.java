public class Aluno extends Pessoa {

    public String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public void mostrarCurso() {
        System.out.println("O meu curso é " + curso);
    }

    @Override
    public void apresentar() {
        System.out.println("Nome: " + nome + "\nCurso: " + curso);
    }
}