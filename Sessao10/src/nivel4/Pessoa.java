package nivel4;

public class Pessoa {

    // Atributos
    private String nome;

    // Construtoe
    public Pessoa(String nome) { // Construtor
        this.nome = nome;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    public void apresentar() {
        System.out.println("Olá, sou " + nome);
    }
}
