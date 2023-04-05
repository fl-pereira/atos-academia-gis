public class Teste {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca("Biblioteca GIS");
        Livro l1 = new Livro(1,"Livro GIS");
        Livro l2 = new Livro(2,"Livro ATOS");
        Livro l3 = new Livro(3,"Livro Java");
        Usuario u1 = new Usuario(1,"Felipe");
        Usuario u2 = new Usuario(2,"Daphne");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);
        biblioteca.listarNomesTodosLivros();
        biblioteca.emprestarLivro(l1, u1);
        biblioteca.emprestarLivro(l3,u2);
        System.out.println(biblioteca.verificarDisponibilidadeLivro(l1));;

    }

}
