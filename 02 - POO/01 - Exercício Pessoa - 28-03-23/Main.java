import java.util.Scanner;

public class Main {
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

        // Cria uma instância da classe-objeto Pessoa com o nome "p" e atribui as variáveis "nome" e "idade"
        Pessoa p = new Pessoa(nome, idade);

        // O objeto "p" da classe-objeto Pessoa tem acesso aos seus métodos
        p.saudacao(nome);
        p.verificaIdade(idade);

        sc.close();
        
    }
}
