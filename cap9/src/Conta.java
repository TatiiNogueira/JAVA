public class Conta {
    private Double saldo;

    public Conta(Double saldo){
        this.saldo = saldo;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public void mostarSaldo(){
        System.out.println("Saldo atual " + saldo + "€");
    }
}
