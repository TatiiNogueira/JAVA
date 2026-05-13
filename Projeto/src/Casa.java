public class Casa {
    String cor;
    int numeroQuartos;
    boolean temGaragem;

    // Construtor
    public Casa(String cor, int numeroQuartos, boolean temGaragem) {
        this.cor = cor;
        this.numeroQuartos = numeroQuartos;
        this.temGaragem = temGaragem;
    }

    // Método para mostrar os dados
    public void mostrarInfo() {
        System.out.println("Casa " + cor + " com " + numeroQuartos + " quartos e garagem:" + temGaragem);
    }

    // Método verificar se a casa é grande ou pequena
    public void temMuitosQuartos() {
        if (numeroQuartos > 3) {
            System.out.println("Casa grande");
        } else {
            System.out.println("Casa pequena");
        }
    }

    public void tipoCasa() {
        if (numeroQuartos <= 2) {
            System.out.println("Pequena");
        } else if (numeroQuartos <= 4) {
            System.out.println("Média");
        } else {
            System.out.println("Grande");
        }
    }

    public void compararCasa(Casa outraCasa) {
        if (this.numeroQuartos > outraCasa.numeroQuartos) {
            System.out.println("Casa 1 é maior");
        } else if (this.numeroQuartos < outraCasa.numeroQuartos) {
            System.out.println("Casa 2 é maior");
        } else {
            System.out.println("As duas casas têm o mesmo tamanho");
        }
    }
}