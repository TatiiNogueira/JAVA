package nivel4;

public class Professor extends Pessoa {
    public Professor(String nome) {
        super(nome);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou professor: " + getNome());
    }
}
