public class Main {
    static void main(String[] args) {

        // Nivel 1
        System.out.println("\nNivel 1");
        Veiculo carro = new Veiculo("Audi", 0.0);
        carro.mostrarVelocidade();

        carro.acelerar(60.0);
        carro.mostrarVelocidade();

        carro.travar(30.0);
        carro.mostrarVelocidade();
        

        //Nivel 2
        System.out.println("\nNivel 2");
        Carro carro2 = new Carro("Ferrari", 0.0, 2);

        carro2.acelerar(50.0);
        carro2.mostrarVelocidade();

         Bicicleta bike = new Bicicleta("Ford", 10.0, true);

         bike.acelerar(5.0);
         bike.mostrarVelocidade();

         bike.travar(2.0);
         bike.mostrarVelocidade();


        //Nivel 3
        System.out.println("\nNivel 3");
        Veiculo v1 = new Veiculo("Genérico", 0.0);
        v1.tipo();

        Carro c1 = new Carro("BMW", 0.0, 4);
        c1.tipo();

        Bicicleta b1 = new Bicicleta("Bicicleta", 10.0, true);
        b1.tipo();
    }
}
