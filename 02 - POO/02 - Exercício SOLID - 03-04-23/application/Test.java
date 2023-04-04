package application;

import entities.Car;
import entities.Motorcyle;

public class Test {
    public static void main(String[] args){
        System.out.println("1. VAMOS CRIAR UM VEÍCULO - CARRO");
        // Criando um novo veículo, do tipo carro e inserindo valores nos atríbutos
        Car c1 = new Car();
        c1.setManufacturer("Ford");
        c1.setModel("Ka");
        c1.setYear(2020);
        c1.setColor("White");
        c1.setDoorsQuantity(4);
        c1.getEngine().setManufacturer("MWM");
        c1.getEngine().setPistonsQuantity(4);
        c1.getEngine().setEngineCapacity(102);

        System.out.println("2. AGORA IREMOS IMPRIMIR OS DETALHES DO CARRO NA TELA");
        // O objeto "c1" tem acesso aos métodos da classe "Car" e aqui é exibido os detalhes do carro através do método printCarDetails()
        c1.printCarDetails();

        System.out.println("3. IMPLEMENTAÇÕES DO MOTOR");
        //O objeto "c1" conta com um objeto Engine dentro de seu construtor,
        // criando a ligação que fornece acesso ao métodos implementados na classe Engine
        c1.getEngine().startVehicle();
        c1.getEngine().turnOffVehicle();

        // O objeto "c1" também tem acesso ao métodos implementados na classe Car
        System.out.println("4. IMPLEMENTAÇÕES DO CARRO");
        c1.openDoors();
        c1.closeDoors();
        c1.openHood();
        c1.closeHood();
        c1.openTrunk();
        c1.closeTrunk();

        System.out.println("5. AGORA VAMOS CRIAR UMA MOTO");
        // Criando um novo veículo, do tipo moto e inserindo valores nos atríbutos
        Motorcyle m1 = new Motorcyle();
        m1.setManufacturer("Honda");
        m1.setModel("TITAN");
        m1.setYear(2013);
        m1.setColor("Black");
        m1.setPassengersNumber(2);
        m1.getEngine().setManufacturer("Honda");
        m1.getEngine().setPistonsQuantity(1);
        m1.getEngine().setEngineCapacity(150);

        System.out.println("6. AGORA VAMOS IMPRIMIR OS DETALHES DA MOTO NA TELA");
        // O objeto "m1" tem acesso aos métodos da classe "Car" e aqui é exibido os detalhes do carro através do método printMotorcycleDetails()
        m1.printMotorCycleDetails();

        System.out.println("7. IMPLEMENTAÇÕES DO MOTOR");
        //O objeto "m1" conta com um objeto Engine dentro de seu construtor,
        // criando a ligação que fornece acesso ao métodos implementados na classe Engine
        m1.getEngine().startVehicle();
        m1.getEngine().turnOffVehicle();

        System.out.println("8. IMPLEMENTAÇÃO DA MOTO");
        // O objeto "m1" também tem acesso ao métodos implementados na classe Car
        m1.frontWhellie();
    }
}
