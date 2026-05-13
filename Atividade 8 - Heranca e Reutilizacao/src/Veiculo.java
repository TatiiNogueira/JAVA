public class Veiculo {

    //Atributos Privados
    private String marca;
    private Double velocidade;

    //Construtor
    public Veiculo(String marca, Double velocidadeInicial) {
        this.velocidade = velocidadeInicial;
        this.marca = marca;
    }

    //Metodo para acelerar o veiculo
    public void acelerar(Double valor) {
        this.velocidade += valor;
    }

    //Metodo para travar o veiculo
    public void travar(Double valor) {
        this.velocidade -= valor;
        //Impedir valores negativos
        if (this.velocidade < 0) {

            this.velocidade = 0.0;

        }
    }
    //Metodo para mostrar velocidade atual
    public void mostrarVelocidade() {
        System.out.println("Velocidade: "+ velocidade +" km/h");
    }

    //Metodo que vai ser subscrito
    public void tipo() {
        System.out.println("Veiculo");
    }
}
