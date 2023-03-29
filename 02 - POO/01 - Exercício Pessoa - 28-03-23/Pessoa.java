public class Pessoa {

    // Cria os atributos da classe e os encapsula para protegê-los
    private String nome;
    private Integer idade;

    // Cria um construtor padrão, sem assinatura
    public Pessoa(){}

    // Cria um construtor com a assinatura, obrigando a inserir nome e idade
    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
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

    // Cria um método void para saudar o usuário
    public void saudacao(String nome){
        System.out.println("### Bem-vindo, " + nome + " ###");
    }

    // Cria um método que envia uma mensagem de acordo com a idade inserida
    public void verificaIdade(Integer idade){
        if(idade == 0 || idade < 0){
            System.out.println("Ops, acho que a idade não pode ser zero ou menor que zero.");
        } else if (idade > 0 && idade <= 20) {
            System.out.println("Você é jovem.");
        } else if (idade > 20 && idade <= 60) {
            System.out.println("Agora você é adulto. Pague os boletos.");
        } else System.out.println("Você é um idoso, hora de descansar e curtir a vida.");
    }
       
}
