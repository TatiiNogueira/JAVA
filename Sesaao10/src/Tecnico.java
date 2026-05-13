public class Tecnico extends Funcionario{
    public Tecnico(String nome, Double salario){
        super(nome, salario);
    }

    @Override
    public void apresentar(){
        System.out.println("Sou o Técnico " + super.getNome() + " e o meu salário é " + super.getSalario());
    }
}
