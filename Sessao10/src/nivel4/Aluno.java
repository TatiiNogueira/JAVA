package nivel4;

public class Aluno extends Pessoa { // Herança
    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou aluno: " + getNome());
    }
}