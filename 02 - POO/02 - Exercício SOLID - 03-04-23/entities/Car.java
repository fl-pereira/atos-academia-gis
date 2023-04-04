// Definindo o pacote atual
package entities;

// Importando a interface do pacote interfaces
import interfaces.CarInterface;

// Herdando a classe veículo e implementando a interface CarInterface com as "regras de negócio" para carros
public class Car extends Vehicle implements CarInterface {

    // Atríbutos específicos da classe, os demais serão herdados
    private Integer doorsQuantity;

    // Construtor padrão
    public Car(){}

    // Construtor com atríbuto
    public Car(Integer doorsQuantity){
        this.doorsQuantity = doorsQuantity;
    }


    // Getters e setters
    public Integer getDoorsQuantity() {
        return doorsQuantity;
    }

    public void setDoorsQuantity(Integer doorsQuantity) {
        this.doorsQuantity = doorsQuantity;
    }

    // Método para imprimir detalhes do carro - é um método específico para carros e não para veículos em geral
    public void printCarDetails(){
        System.out.println("### DETALHES DO CARRO ###");
        System.out.println("------------------------");
        System.out.println("Marca: " + getManufacturer()
                        + " // Modelo: " + getModel()
                        + " // Ano: " + getYear()
                        + " // Cor: " + getColor()
                        + " // Quantidade de portas: " + getDoorsQuantity()
                        + " // Quantidade de pistões: " + engine.getPistonsQuantity()
                        + " // Potência do motor: " + engine.getEngineCapacity() + "hp"
                        + " // Fabricante do motor: " + engine.getManufacturer());
        System.out.println("-------------------------");
        System.out.println("### FIM DOS DETALHES ###");
    }

    // Implementando os métodos da interface CarInterface
    @Override
    public void openDoors() {
        System.out.println("Portas abertas");
    }

    @Override
    public void closeDoors() {
        System.out.println("Portas fechadas");
    }

    @Override
    public void openHood() {
        System.out.println("Capô aberto");
    }

    @Override
    public void closeHood() {
        System.out.println("Capô fechado");
    }

    @Override
    public void openTrunk() {
        System.out.println("Porta-malas aberto");
    }

    @Override
    public void closeTrunk() {
        System.out.println("Porta-malas fechado");
    }

}
