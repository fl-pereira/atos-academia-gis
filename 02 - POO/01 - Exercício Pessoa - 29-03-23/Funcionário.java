public class Funcionário extends Pessoa {

    private String cargo;
    private String empresa;

    public Funcionário(){}

    public Funcionário(String cargo, String empresa) {
        this.cargo = cargo;
        this.empresa = empresa;
    }

    public Funcionário(String nome, Integer idade, String cpf, String cidadeNascimento, String cargo, String empresa) {
        super(nome, idade, cpf, cidadeNascimento);
        this.cargo = cargo;
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String exibeDados(){
        String msg = "O funcionário " +
                getNome() + ", da empresa "
                + getEmpresa()
                + ", responsável pelo cargo de "
                + getCargo()
                + ", nasceu em "
                + getCidadeNascimento();
        return msg;
    }
}
