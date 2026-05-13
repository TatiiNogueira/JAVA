import nivel1.*;
import nivel2.*;
import nivel4.*;
import nivel5.*;
import nivel6.*;

public class Main {
    public static void main(String[] args) {
        // Nivel 1
        Animal animalGenerico = new Animal();
        System.out.print("Animal: ");
        animalGenerico.fazerSom();

        Cao meuCao = new Cao();
        System.out.print("Cão: ");
        meuCao.fazerSom();

        Gato meuGato = new Gato();
        System.out.print("Gato: ");
        meuGato.fazerSom();

        // Nivel 2
        Veiculo generico = new Veiculo();
        System.out.print("Veículo: ");
        generico.mover();

        Carro meuCarro = new Carro();
        System.out.print("Carro: ");
        meuCarro.mover();

        Moto minhaMoto = new Moto();
        System.out.print("Moto: ");
        minhaMoto.mover();

        // Nivel 3
        // Array
        Veiculo[] lista = {
                new Carro(),
                new Moto(),
                new Veiculo(),
                new Carro()
        };

        // For
        System.out.println("--- For ---");
        for (Veiculo v : lista) {
            v.mover();
        }

        // Nivel 4
        Pessoa p = new Pessoa("Carlos");
        p.apresentar();

        Aluno a = new Aluno("Ana");
        a.apresentar();

        Professor prof = new Professor("Roberto");
        prof.apresentar();

        //Nivel 5
        Produto pp = new Produto();
        pp.info();

        ProdutoAlimentar pa = new ProdutoAlimentar();
        pa.info();

        ProdutoEletronico pe = new ProdutoEletronico();
        pe.info();

        // Nivel 6
        Funcionario f1 = new Funcionario("Ana", 1000);
        Gerente g1 = new Gerente("Carlos", 2500, 500);
        Programador p1 = new Programador("Rui", 1800, 10);
        Programador p2 = new Programador("Marta", 1800, 5);

        // Guardar num array
        Funcionario[] listaFuncionarios = { f1, g1, p1, p2 };

        System.out.println("=== FOLHA DE PAGAMENTOS ===");

        // Ciclo for para mostrar o resultado
        for (Funcionario f : listaFuncionarios) {
            f.calcularPagamento();
        }
    }
}
