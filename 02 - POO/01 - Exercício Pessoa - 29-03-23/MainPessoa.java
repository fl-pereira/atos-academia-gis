import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args){

        // Cria um objeto para receber dados do usuário
        Scanner sc = new Scanner(System.in);

        // Imprime a mensagem no console
        System.out.println("Insira seu nome: ");
        // Atribui o dado inserido pelo usuário para a variável "nome"
        String nome = sc.next();
        System.out.println("Insira sua idade: ");
        // Atribui o dado inserido pelo usuário para a variável "idade"
        Integer idade = sc.nextInt();
        System.out.println("Insira o CPF");
        String cpf = sc.next();
        System.out.println("Insira a cidade de nascimento: ");
        String cidadeNascimento = sc.next();
        System.out.println("Qual o cargo da pessoa? ");
        String cargo = sc.next();
        System.out.println("E qual a empresa?");
        String empresa = sc.next();

        // Cria uma instância da classe-objeto Pessoa com o nome "p" e atribui as variáveis "nome" e "idade"
        Funcionário f = new Funcionário(nome, idade, cpf, cidadeNascimento, cargo, empresa);

        // O objeto "p" da classe-objeto Pessoa tem acesso aos seus métodos
        System.out.println(f.exibeDados());

        sc.close();
        
    }
}
