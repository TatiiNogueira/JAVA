public class Pessoa {

    private String nome;

    public Pessoa (String nome){
        this.nome = nome;
    }

    public void apresentar(){
        System.out.println("Olá " + nome);
    }
}
