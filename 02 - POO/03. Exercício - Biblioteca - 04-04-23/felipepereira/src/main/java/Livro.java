public class Livro{

    private Integer id;
    private String nomeLivro;
    private boolean livroDisponivel;

    public Livro(Integer id, String nomeLivro){
        this.id = id;
        this.nomeLivro = nomeLivro;
        this.livroDisponivel = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public boolean isLivroDisponivel() {
        return livroDisponivel;
    }

    public void setLivroDisponivel(boolean livroDisponivel) {
        this.livroDisponivel = livroDisponivel;
    }

    /*
        NA CONSTRUÇÃO PADRÃO DO OBJETO LIVRO, O VALOR PARA livroDisponivel É SEMPRE TRUE
        AO SER EMPRESTADO PARA UM USUARIO, ESSE MÉTODO TORNA O VALOR false
    */
    public void tornaLivroIndisponivel(Livro livro){
        livro.setLivroDisponivel(false);
    }

}