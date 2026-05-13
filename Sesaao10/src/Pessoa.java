public class Pessoa {

    public String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void apresentar() {

        System.out.println("O meu nome é " + nome);
    }
}
