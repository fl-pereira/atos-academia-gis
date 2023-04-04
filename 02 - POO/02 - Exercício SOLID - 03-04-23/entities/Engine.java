// Definindo o pacote atual

package entities;

// Importando a interface do pacote interfaces

import interfaces.EngineInterface;

// Iimplementando a interface EngineInterface com as "regras de negócio" para motores

public class Engine implements EngineInterface {

    // Atríbutos da classe
    private String manufacturer;
    private Integer pistonsQuantity;
    private Integer engineCapacity;

    // Construtor padrão
    public Engine(){}

    // Construtor com atríbuto
    public Engine(String manufacturer, Integer pistonsQuantity, Integer engineCapacity){
        this.manufacturer = manufacturer;
        this.pistonsQuantity = pistonsQuantity;
        this.engineCapacity = engineCapacity;
    }

    // Getters e setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getPistonsQuantity() {
        return pistonsQuantity;
    }

    public void setPistonsQuantity(Integer pistonsQuantity) {
        this.pistonsQuantity = pistonsQuantity;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    // Implementando os métodos da interface CarInterface
    @Override
    public void startVehicle() {
        System.out.println("Engine is ON.");
    }

    @Override
    public void turnOffVehicle() {
        System.out.println("Engine is OFF");
    }
}
