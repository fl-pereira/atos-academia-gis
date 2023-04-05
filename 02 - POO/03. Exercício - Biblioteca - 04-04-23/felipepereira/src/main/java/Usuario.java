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

    // ADICIONA UM LIVRO NA LISTA
    public void adicionaLivroEmprestado(Livro livro) {
        livrosEmprestados.add(livro);
    }

    // REMOVE UM LIVRO DA LISTA
    public void removeLivroEmprestado(Livro livro){
        livrosEmprestados.remove(livro);
    }

    // IMPRIME UMA LISTA CONTENDO TODOS OS LIVROS QUE ESTÃO EMPRESTADOS PARA O USUARIO
    public void listaLivrosEmprestadosUsuario(){
        System.out.println("Livros emprestados para o usuario: " + getNomeUsuario());
        for(Livro l : livrosEmprestados){
            System.out.println("Nome: " + l.getNomeLivro());
        }
        System.out.println("---");
    }

    // VERIFICA SE O LIVRO RECEBIDO COMO PARÂMETRO ESTÁ INSERIDO NA LISTA livrosEmprestados
    public boolean verificaLivroEmprestado(Livro livro){
        return livrosEmprestados.contains(livro);
    }

}
