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

    
    
}
