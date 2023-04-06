import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nomeBiblioteca;
    private List<Livro> listaLivros = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();

    public Biblioteca(String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    // ADICIONA UM LIVRO NA LISTA
    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
    }

    // REMOVE UM LIVRO DA LISTA
    public void removerLivro(Livro livro){
        listaLivros.remove(livro);
    }

    /*
        RECEBE UM LIVRO E UM USUARIO COMO PARÂMETROS, FAZ A VERIFICAÇÃO DA DISPONIBILIDADE DE EMPRÉSTIMO DO LIVRO
        SE ESTIVER DISPONÍVEL, ADICIONA O LIVRO A LISTA DE LIVROS EMPRESTADOS DO USUÁRIO
        E TORNA O LIVRO INDISPONÍVEL PARA EMPRÉSTIMO ATRAVÉS DO MÉTODO isLivroDisponivel()
    */
    public void emprestarLivro(Livro livro, Usuario usuario) {
        if(livro.isLivroDisponivel()) {
            usuario.adicionaLivroEmprestado(livro);
            livro.tornaLivroIndisponivel(livro);
            System.out.println(livro.getNomeLivro() + " emprestado para o usuario " + usuario.getNomeUsuario());
        } else {
            System.out.println("Livro indisponivel no momento.");
        }
    }

    /*
        RECEBE UM OBJETO LIVRO E UM OBJETO USUÁRIO COMO PARÂMETROS, VERIFICA SE O MESMO ESTÁ NA LISTA DE LIVROS EMPRESTADOS DO USUÁRIO
        SE FOR true, REMOVE DA LISTAGEM E TORNA O ESTADO DE DISPONIBILIDADE DE EMPRÉSTIMO DO LIVRO COMO true
        SE FOR false, IMPRIME UMA MENSAGEM NA TELA
    */
    public void devolverLivro(Livro livro, Usuario usuario) {
        Integer livroId = livro.getId();
        if(usuario.verificaLivroEmprestado(livro)){
            usuario.removeLivroEmprestado(livro);
            livro.setLivroDisponivel(true);
        } else {
            System.out.println("Este livro nao está emprestado para este usuario.");
        }
    }

    // VERIFICA O STATUS DE DISPONIBILIDADE DE EMPRÉSTIMO DO LIVRO E IMPRIME UMA MENSAGEM NA TELA
    public void verificaDisponibilidadeLivro(Livro livro){
        if(livro.isLivroDisponivel()){
            System.out.println("Livro disponivel para emprestimo");
        } else System.out.println("Livro indisponivel para emprestimo ");
    }

    // IMPRIME UMA LISTAGEM COM OS NOMES DE TODOS OS LIVROS CADASTRADOS, PERCORRENDO A LISTA ATRAVÉS DE foreach
    public void listarNomesTodosLivros(){
        System.out.println("Listagem de todos os livros cadastrados");
        for(Livro l : listaLivros){
            System.out.println(l.getNomeLivro());
        }
    }

}
