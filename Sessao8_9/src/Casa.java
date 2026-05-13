public class Casa {
    // Atributos privados (Encapsulamento)
    private String cor;
    private Integer quartos;
    private Boolean garagem;

    // Construtor: Inicializa os dados da casa
    public Casa(String cor, Integer quartos, Boolean garagem) {
        this.cor = cor;
        this.quartos = quartos;
        this.garagem = garagem;
    }

    // Getters: Permitem ler os dados privados
    public String getCor() { return cor; }
    public Integer getQuartos() { return quartos; }
    public Boolean getGaragem() { return garagem; }

    // =========================================================
    // NÍVEL 7 - MÉTODOS ESTÁTICOS
    // =========================================================

    // Devolve a casa que tem mais quartos
    public static Casa maiorCasa(Casa c1, Casa c2) {
        if (c1.getQuartos() >= c2.getQuartos()) {
            return c1;
        } else {
            return c2;
        }
    }

    // Verifica se duas casas têm o mesmo número de quartos
    public static Boolean saoIguais(Casa c1, Casa c2) {
        return c1.getQuartos().equals(c2.getQuartos());
    }
}