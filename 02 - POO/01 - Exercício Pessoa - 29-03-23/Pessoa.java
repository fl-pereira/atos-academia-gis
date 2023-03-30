public class Pessoa {

    // Cria os atributos da classe e os encapsula para protegê-los
    private String nome;
    private Integer idade;
    private String cpf;
    private String cidadeNascimento;

    // Cria um construtor padrão, sem assinatura
    public Pessoa(){}

    // Cria um construtor com a assinatura, obrigando a inserir nome e idade


    public Pessoa(String nome, Integer idade, String cpf, String cidadeNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cidadeNascimento = cidadeNascimento;
    }

    // Cria os getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    // Cria um método void para saudar o usuário
    public String saudacao(String nome){
        return "### Bem-vindo, " + nome + " ###";
    }

    // Cria um método que envia uma mensagem de acordo com a idade inserida
    public String verificaIdade(Integer idade){
        String msg;
        if(idade == 0 || idade < 0){
            msg = "Ops, acho que a idade não pode ser zero ou menor que zero.";
        } else if (idade > 0 && idade <= 20) {
            msg = "Você é jovem.";
        } else if (idade > 20 && idade <= 60) {
            msg = "Agora você é adulto. Pague os boletos.";
        } else msg = "Você é um idoso, hora de descansar e curtir a vida.";
        return msg;
    }
       
}
