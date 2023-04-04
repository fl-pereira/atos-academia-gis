package entities;

// O encapsulamento "abstract" impede que seja criado um objeto do tipo Vehicle,
// obrigando que seja criado um objeto do tipo Car ou Motorcycle, que herdam Vehicle
abstract class Vehicle {

    private String manufacturer;
    private String model;
    private Integer year;
    private String color;

    // Criando um objeto do tipo Engine para inserir como atríbuto do construtor
    Engine engine = new Engine();

    // Construtor padrão
    public Vehicle(){}

    // Construtor com atríbutos
    public Vehicle(String manufacturer,
                   String model,
                   Integer year,
                   String color,
                   String engineManufacturer,
                   Integer pistonsQuantity,
                   Integer engineCapacity)
    {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.color = color;
        engine.setManufacturer(engineManufacturer);
        engine.setPistonsQuantity(pistonsQuantity);
        engine.setEngineCapacity(engineCapacity);
    }

    // Getters e setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }    

}