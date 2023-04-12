import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot implements ParkingLotInterface {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    private String name;
    private List<Vehicle> listVehicle = new ArrayList<>();
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

    public void add(Vehicle vehicle){
        listVehicle.add(vehicle);
    }

    public void park(String plate){
        for (Vehicle v : listVehicle){
            if(v.getPlate().contains(plate)){
                if(!v.isParked()){
                    v.setParked(true);
                    System.out.println("Veicúlo com placa " + v.getPlate() + " estacionado com sucesso.");
                }
                else System.out.println("Veículo já estacionado.");
            }
        }
    }

    public void leave(String plate){
        for (Vehicle v : listVehicle){
            if(v.getPlate().contains(plate)){
                if(v.isParked()){
                    v.setParked(false);
                    System.out.println("Veicúlo com placa " + v.getPlate() + " saindo do estacionamento.");
                }
                else System.out.println("Veículo não está mais aqui.");
            }
        }
    }

    public void getAllPlatesToPark(){
        // LISTANDO TODAS AS PLACAS DE VEÍCULOS PRONTOS PARA ESTACIONAR
        for(Vehicle v : listVehicle){
            if(!v.isParked()){
                System.out.println("Placa: " + v.getPlate());
            }
        }
    }
    public void getAllParkedPlates(){
        // LISTANDO TODAS AS PLACAS DE VEÍCULOS ESTACIONADOS
        for(Vehicle v : listVehicle){
            if(v.isParked()){
                System.out.println("Placa: " + v.getPlate());
            }
        }
    }

    public Integer getIndexOfVehicle(String plate){
        // CRIEI UM MÉTODO PARA PEGAR A POSIÇÃO DENTRO DA LIST E SOMEI +1 PARA NÃO INICIAR EM ZERO
        Integer indexOf = 0;
        for(Vehicle v : listVehicle){
            if(v.getPlate().contains(plate)){
                indexOf = listVehicle.indexOf(v) + 1;
            }
        }
        return indexOf;
    }

    public void printMsg(String plate, Integer time){
        // MÉTODO PARA IMPRIMIR A MENSAGEM FINAL
        for(Vehicle v : listVehicle) {
            if(v.getPlate().contains(plate)) {
                Integer numVaga = getIndexOfVehicle(v.getPlate());
                Double totalValue = totalValue(time);
                System.out.println("O veículo de PLACA '" + v.getPlate() + "' e TIPO '" + v.getType() + "', ocupou a vaga '" + numVaga + "' por " + time + " horas e pagou o valor de R$" + df.format(totalValue));
            }
        }
    }

    @Override
    public Double totalValue(Integer time) {
        return priceHour * time;
    }

}
