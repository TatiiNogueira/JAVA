public class Conversor {
    private Double c;
    private Double f;

    public Conversor(Double c) {
        this.c = c;
    }

    public void calcular() {
        this.f = (c * 9/5) + 32;
    }

    public Double getFahrenheit() {
        return f;
    }
}