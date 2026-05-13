void main() {
    // Declaração de variáveis para armazenar duas notas
    double nota1 = 17;
    double nota2 = 18;

    // Cálculo da média final utilizando um método da classe Calculadora
    double mediaFinal = Calculadora.calcularMedia(nota1, nota2);

    // Estrutura condicional para verificar se o aluno está aprovado
    if(mediaFinal >= 10) {
        // Impressão da média final
        System.out.println("Média Final");
        System.out.println(mediaFinal);

        // Mensagem de aprovação
        System.out.println("Aprovado!");
    }
    else {
        // Impressão da média final
        System.out.println("Média Final");
        System.out.println(mediaFinal);

        // Mensagem de reprovação
        System.out.println("Reprovado");
    }

    // Declaração de variáveis de diferentes tipos
    int idade = 12;        // Variável do tipo inteiro
    double pi = 3.14;     // Variável do tipo decimal

    // Impressão dos valores das variáveis
    System.out.println(idade);
    System.out.println(pi);

    // Declaração de um array de Strings com nomes
    String[] nome = {"Maria","João"};

    // Conversão do array para lista e impressão
    System.out.println(Arrays.stream(nome).toList());

    // Acesso individual aos elementos do array
    System.out.println(nome[0]); // Primeiro elemento
    System.out.println(nome[1]); // Segundo elemento

    // Criação de um objeto da classe Alunos
    Alunos aluno1 = new Alunos("Tatiana",23,"Seixal");
    Alunos aluno2 = new Alunos("Carlos",34,"Russia");

    // Impressão do objeto (usa o método toString da classe Alunos)
    System.out.println(aluno1);
    System.out.println(aluno2);

    // Criação de um objeto da classe Pessoa com nome "Hugo" e idade 22
    Pessoa p1 = new Pessoa("Hugo", 22);
    // Chamada do método apresentar() para mostrar os dados da pessoa
    p1.apresentar();

    // Criação de outro objeto da classe Pessoa com nome "Filipa" e idade 436
    Pessoa p2 = new Pessoa("Filipa", 436);
    // Chamada do método apresentar() para mostrar os dados da segunda pessoa
    p2.apresentar();
}