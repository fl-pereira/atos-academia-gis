import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = sc.next();
        System.out.println("Insira sua idade: ");
        Integer idade = sc.nextInt();

        Pessoa p = new Pessoa(nome, idade);

        System.out.printf("### BEM-VINDO, %s ###%n", p.getNome());
        if(p.getIdade() == 0 || p.getIdade() < 0){
            System.out.println("Ops, acho que a idade não pode ser zero ou menor que zero.");
        } else if (p.getIdade() > 0 && p.getIdade() <= 20) {
            System.out.println("Você é jovem.");
        } else if (p.getIdade() > 20 && p.getIdade() <= 60) {
            System.out.println("Agora você é adulto. Pague os boletos.");
        } else System.out.println("Você é um idoso, hora de descansar e curtir a vida.");

        sc.close();
        
    }
}
