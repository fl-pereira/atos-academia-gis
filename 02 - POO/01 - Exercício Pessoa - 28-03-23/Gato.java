public class Gato extends Animal {
    private String nome;

    public Gato(){}

    public Gato(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void comunicar(){
        System.out.println("O gato miou.");
    }
}
