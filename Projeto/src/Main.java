public class Main {
    public static void main(){
        // Criar duas casas
        Casa casa1 = new Casa("amarelo", 3, false);
        Casa casa2 = new Casa("azul", 2, true);
        Casa casa3 = new Casa("verde", 5, true);

        // Mostrar dados
        casa1.mostrarInfo();
        casa1.temMuitosQuartos();
        casa1.tipoCasa();

        casa2.mostrarInfo();
        casa2.temMuitosQuartos();
        casa2.tipoCasa();

        casa1.compararCasa(casa2);

        casa3.mostrarInfo();
        casa3.temMuitosQuartos();
        casa3.tipoCasa();
    }
}
