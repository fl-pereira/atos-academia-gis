import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        // DEFININDO A REGIÃO "US" PARA TER O "." COMO SEPARADOR DE CASA DECIMAL
        Locale.setDefault(Locale.US);
        // DEFININDO UMA CONDICIONAL PARA LOOP DO MENU
        char count = 'N';
        // INSTACIANDO UM OBJETO SCANNER PARA RECEBER OS DADOS
        Scanner sc = new Scanner(System.in);

        // INSTANCIANDO UM OBJETO PARKINGLOT, ATRIBUINDO NOME E VALOR DA HORA
        ParkingLot parkingLot = new ParkingLot("Estacionamento GIS", 10.00);
        // CRIANDO UM LOOP PARA INSERÇÃO DE VEÍCULOS
        do {
            // RECEBENDO OS DADOS DO VEÍCULO COM ENTRADA ATRAVÉS DO SCANNER
            System.out.println("O veículo é uma MOTO ou CARRO?");
            String type = sc.next();
            System.out.println("Modelo: ");
            String model = sc.next();
            System.out.println("Marca: ");
            String manufacturer = sc.next();
            System.out.println("Placa: ");
            String plate = sc.next();

            // INSTANCIANDO UM OBJETO VEICULO
            Vehicle vehicle = new Vehicle(plate, model, manufacturer, type);

            // INSERINDO O VEÍCULO NA LISTA DE DISPONÍVEIS PARA ESTACIONAR
            parkingLot.add(vehicle);

            // VERIFICANDO SE DESEJA INSERIR OUTRO VEÍCULO PARA SER ESTACIONADO
            System.out.println("Deseja cadastrar outro veículo? S - Sim / N - Não");
            count = sc.next().charAt(0);
        } while ((count != 'N'));

        System.out.println(">>> ESTACIONAR VEÍCULO");
        // CRIANDO UM LOOP PARA ESTACIONAR VEÍCULOS
        do {
            // IMPRIMI A LISTA DE PLACAS DISPONÍEIS PARA ESTACIONAR
            parkingLot.getAllPlatesToPark();
            // SOLICITANDO A PLACA DO VEÍCULO PARA ESTACIONAR
            System.out.println("Informe a placa do veículo que deseja estacionar: ");
            String plateToPark = sc.next();
            parkingLot.park(plateToPark);

            // VERIFICANDO SE DESEJA ESTACIONAR OUTRO VEÍCULO
            System.out.println("Deseja estacionar outro veículo? S - Sim / N - Não");
            count = sc.next().charAt(0);
        } while ((count != 'N'));

        System.out.println(">>> REMOVER VEÍCULO");
        // CRIANDO UM LOOP PARA REMOVER VEÍCULO
        do {
            // IMPRIMI A LISTA DE PLACAS DISPONÍEIS PARA RETIRAR
            parkingLot.getAllParkedPlates();
            // SOLICITANDO A PLACA DO VEÍCULO PARA REMOVER
            System.out.println("Informe a placa do veículo que deseja retirar: ");
            String plateToLeave = sc.next();

            System.out.println("Quantas horas o veículo ficou estacionado? ");
            Integer timeParked = sc.nextInt();

            parkingLot.printMsg(plateToLeave, timeParked);


        } while ((count != 'N'));

        // ENCERRANDO O OBJETO SCANNER
        sc.close();

    }
    
}
