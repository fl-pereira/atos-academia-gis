public class Livro{

    private Integer id;
    private String nomeLivro;
    private boolean livroEmprestado;

    public Livro(Integer id, String nomeLivro){
        this.id = id;
        this.nomeLivro = nomeLivro;
        this.livroEmprestado = false;
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

    public boolean isLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(boolean livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    

}