import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        // Criando uma variável para o menu inicial em loop
        String choice = "";
        // Configurando o "." como separador da casa decimal
        Locale.setDefault(Locale.US);
        // Criando um objeto para entrada de dados
        Scanner sc = new Scanner(System.in);

        System.out.println("> ESTACIONAMENTO GIS <");
        System.out.println("");
        // Instanciando o objeto do tipo ParkingLot
        ParkingLot parkingLot = new ParkingLot("ESTACIONAMENTO GIS", 10.00);

        // Recebendo os dados e criando um objeto do tipo veículo
        do{
            System.out.println("O veículo é um carro (C) ou moto (M):");
            char type = sc.next().charAt(0);
            System.out.println("Modelo do veículo:");
            String model = sc.next();
            System.out.println("Marca do veículo:");
            String manufacturer = sc.next();
            System.out.println("Placa do veículo:");
            String plate = sc.next();

            Vehicle v = new Vehicle();
            v.setModel(model);
            v.setManufacturer(manufacturer);
            v.setPlate(plate);
            v.setType(type);

            parkingLot.prepareToPark(v);

            // Atribuindo um valor a String "choice" para cadastrar mais veículos ou prosseguir
            System.out.println("Deseja criar outro veículo para estacionar (S - Sim // X - Sair):");
            choice = sc.next();
        } while (!choice.equalsIgnoreCase("X"));

        System.out.println();
        System.out.println("Insira a placa do veículo que deseja estacionar: ");
        String plateToPark = sc.next();

        sc.close();

    }
    
}
