import java.util.ArrayList;
import java.util.List;

public class ParkingLot{

    private String name;
    private List<Vehicle> parkingSpaces = new ArrayList<>();
    private List<Vehicle> vehiclesToPark = new ArrayList<>();
    private Double priceHour;

    public ParkingLot(String name, Double priceChour){
        this.name = name;
        this.priceHour = priceChour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(Double priceHour) {
        this.priceHour = priceHour;
    }

    public void prepareToPark(Vehicle vehicle){
        vehiclesToPark.add(vehicle);
    }

    public  void removePrepareToPark(Vehicle vehicle){
        vehiclesToPark.remove(vehicle);
    }

    public void park(Vehicle vehicle){
        parkingSpaces.add(vehicle);
    }

    public void leave(Vehicle vehicle){
        parkingSpaces.remove(vehicle);
    }

    public Double totalValue(Double priceHour, Integer time){
        return priceHour * time;
    }

    public boolean verifyIfAvailableToPark(String plate){
        boolean isAvailable = false;
        for(Vehicle v : vehiclesToPark){
            if(v.getPlate().contains(plate)){
                isAvailable = true;
            }
        }
        return isAvailable;
    }

    public boolean verifyIfParked(Vehicle vehicle){
        boolean isParked = false;
        for(Vehicle v : parkingSpaces){
            isParked = parkingSpaces.contains(v.getPlate());
        }
        return isParked;
    }

}
