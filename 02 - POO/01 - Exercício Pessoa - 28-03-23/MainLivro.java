import java.util.Scanner;

public class MainLivro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("### CADASTRE E EXIBA UM LIVRO ###");
        System.out.println("Insira o título do livro: ");
        String titulo = sc.next();
        System.out.println("Insira o nome do autor: ");
        String autor = sc.next();
        System.out.println("Insira o nome da editora: ");
        String editora = sc.next();
        System.out.println("Insira o ano de publicação: ");
        Integer anoPublicacao = sc.nextInt();

        Livro l1 = new Livro(titulo,autor,editora,anoPublicacao);
        System.out.println(l1.exibeTituloAutorAnoPublicacao());;

        sc.close();
    }
}
