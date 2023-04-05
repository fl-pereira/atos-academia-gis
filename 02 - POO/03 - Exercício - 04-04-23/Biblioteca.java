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

    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
    }

    public void emprestarLivro(Livro livro, Usuario usuario) {
        if(!livro.isLivroEmprestado()) {
            usuario.adicionaLivroEmprestado(livro);
            livro.setLivroEmprestado(true);
            System.out.println("Livro " + livro.getNomeLivro() + " emprestado para o usuário " + usuario.getNomeUsuario());
        } else {
            System.out.println("Livro indisponível no momento.");
        }
    }

    public void devolverLivro(Livro livro, Usuario usuario) {
        Integer livroId = livro.getId();
        if(usuario.verificaLivroEmprestado(livroId)){
            usuario.removeLivroEmprestado(livro);
            livro.setLivroEmprestado(false);
        } else {
            System.out.println("Este livro não está emprestado para este usuário.");
        }
    }

    public String verificarDisponibilidadeLivro(Livro livro){
        String msg = "";
        for(Livro l : listaLivros){
            if(l.isLivroEmprestado()){
                msg = ("Livro indisponível");
            } else {
                msg = ("Livro disponível");
            }
        }
        return msg;
    }

    public void listarNomesTodosLivros(){
        for(Livro l : listaLivros){
            System.out.println(l.getNomeLivro());
        }

    }
    
}
