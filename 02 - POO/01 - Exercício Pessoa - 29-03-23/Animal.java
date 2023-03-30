public class Animal {
    private String especie;

    public Animal(){}

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void comunicar(){
        System.out.println("O animal se comunicou.");
    }

    public void mover(){
        System.out.println("O animal se moveu.");
    }
}
