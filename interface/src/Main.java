public class Main {
    public static void main(String[] args) {
        // --- NÍVEL 1: TRANSPORTE ---
        Transporte meuCarro = new Carro();
        meuCarro.mover();

        Transporte minhaBicicleta = new Bicicleta();
        minhaBicicleta.mover();

        // --- NÍVEL 2: FORMA (CHAMADA SIMPLES) ---
        Forma q1 = new Quadrado();
        Forma c1 = new Circulo();

        System.out.println("\n--- Chamadas Individuais (Formas) ---");
        q1.calcularArea();
        c1.calcularArea();

        // --- NÍVEL 3: POLIMORFISMO (ARRAY DE FORMAS) ---
        // Conforme solicitado em image_d3e410.png
        System.out.println("\n--- Chamadas via Array (Polimorfismo) ---");
        Forma[] formas = { new Quadrado(), new Circulo(), new Quadrado() };

        for (Forma f : formas) {
            f.calcularArea();
        }

        // --- NÍVEL 4: APLICAÇÃO (NOTIFICAÇÃO) ---
        Notificacao servicoEmail = new Email();
        Notificacao servicoSMS = new SMS();

        System.out.println("\n--- Notificações Individuais ---");
        servicoEmail.enviar("Bem-vindo ao curso de Java!");
        servicoSMS.enviar("O seu código de verificação é 1234.");

        // Exemplo de polimorfismo com Notificações
        Notificacao[] listaNotificacoes = { new Email(), new SMS() };

        System.out.println("\n--- Disparando notificações em massa ---");
        for (Notificacao n : listaNotificacoes) {
            n.enviar("Alerta de sistema: Manutenção agendada.");
        }

        // --- NÍVEL 5: DESAFIO (SISTEMA DE MÚSICA) ---
        System.out.println("\n--- Concerto (Desafio Nível 5) ---");

        // Uso de polimorfismo: tratando diferentes classes como o tipo da interface
        Instrumento[] orquestra = { new Piano(), new Guitarra(), new Piano() };

        // Percorrendo o array e chamando o método comum
        for (Instrumento i : orquestra) {
            i.tocar();
        }
    }
}