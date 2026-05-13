public class Main {
    public static void main(){
        Pessoa pessoa = new Pessoa("Tatiana");
        pessoa.apresentar();

        Pessoa p = new Pessoa("Paulo");
        p.apresentar();

        Integer resultado = Util.triplo(3);
        System.out.println(resultado);

        Produto produto = new Produto("caneta", 234);
        produto.mostrarDado();

        Produto produto2 = new Produto("caneta", 234);
        produto2.mostrarDado();

        Conta conta = new Conta(23.8);
        conta.depositar(345.0);
    }
}
