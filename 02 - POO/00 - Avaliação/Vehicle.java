
public class Vehicle {

    private String model;
    private String manufacturer;
    private String plate;
    private String type;
    private boolean parked = false;

    public Vehicle(String type, String model, String manufacturer, String plate){
        this.type = type;
        this.model = model;
        this.manufacturer = manufacturer;
        this.plate = plate;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
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