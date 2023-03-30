import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args){
        System.out.println("Bora fazer os bicho andar.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do bicho:");
        String nome = sc.next();
        System.out.println("E qual a espécie");
        String especie = sc.next();

        Gato gato = new Gato(nome);
        gato.setEspecie(especie);

        gato.comunicar();
        gato.mover();

        sc.close();
    }
}
