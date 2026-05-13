public class Gerente extends Funcionario {
    public Gerente(String nome, Double salario){
        super(nome, salario);
    }

    @Override
    public void apresentar(){
        System.out.println("Sou o gerente " + super.getNome() + " e o meu salário é " + super.getSalario());
    }
}