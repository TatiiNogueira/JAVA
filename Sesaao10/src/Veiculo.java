public class Veiculo {
    private String marca;


    //Construtor
    public Veiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca(){
        return  marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    //Metodo mostrarMarca
    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }
}