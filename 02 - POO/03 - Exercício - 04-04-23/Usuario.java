import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private Integer id;
    private String nomeUsuario;
    private List<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(Integer id, String nomeUsuario){
        this.id = id;
        this.nomeUsuario = nomeUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    public void adicionaLivroEmprestado(Livro livro) {
        livrosEmprestados.add(livro);        
    }

    public void removeLivroEmprestado(Livro livro){
        livrosEmprestados.remove(livro);
    }

    public boolean verificaLivroEmprestado(Integer livro){
        if(livrosEmprestados.contains(livro)){
            return true;
        } else return false;
    }
    
}
