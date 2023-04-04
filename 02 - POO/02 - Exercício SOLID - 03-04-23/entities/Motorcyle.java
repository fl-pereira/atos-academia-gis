// Definindo o pacote atual
package entities;

// Importando a interface do pacote interfaces
import interfaces.MotorCycleInterface;

// Herdando a classe veículo e implementando a interface MotorcycleInterface com as "regras de negócio" para motos
public class Motorcyle extends Vehicle implements MotorCycleInterface {

    // Atríbutos específicos da classe, os demais serão herdados
    private Integer passengersNumber;

    // Construtor padrão
    public Motorcyle(){}

    // Construtor com atríbuto
    public Motorcyle(Integer passengersNumber){
        this.passengersNumber = passengersNumber;
    }

    // Getters e setters
    public Integer getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(Integer passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    // Método para imprimir detalhes da moto - é um método específico para motos e não para veículos em geral
    public void printMotorCycleDetails(){
        System.out.println("### DETALHES DA MOTO ###");
        System.out.println("------------------------");
        System.out.println("Marca: " + getManufacturer()
                + " // Modelo: " + getModel()
                + " // Ano: " + getYear()
                + " // Cor: " + getColor()
                + " // Quantidade de passageiros: " + getPassengersNumber()
                + " // Quantidade de pistões: " + engine.getPistonsQuantity()
                + " // Cilindradas do motor: " + engine.getEngineCapacity() + "cc"
                + " // Fabricante do motor: " + engine.getManufacturer());
        System.out.println("-------------------------");
        System.out.println("### FIM DOS DETALHES ###");
    }

    // Implementando os métodos da interface MotorcycleInterface

    @Override
    public void frontWhellie() {
        System.out.println("A moto está empinando");
    }
}
