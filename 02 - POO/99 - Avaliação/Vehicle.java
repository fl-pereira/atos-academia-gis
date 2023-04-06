
abstract class Vehicle {

    private String model;
    private String manufacturer;
    private String plate;
    private char type;
    private boolean parked;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPlate() {
        return plate;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    } 

    public void setPlate(String plate) {
        this.plate = plate;
    }    

    public boolean isParked() {
        return parked;
    }
    public void setParked(boolean parked) {
        this.parked = parked;
    }   

}