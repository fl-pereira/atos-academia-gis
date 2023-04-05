public class Teste {
    // CLASSE PARA EXECUÇÃO DA APLICAÇÃO
    public static void main(String[] args){
        // CRIANDO BIBLIOTECA PARA ARMAZENAR LIVROS E USUARIOS
        Biblioteca biblioteca = new Biblioteca("Biblioteca GIS");

        // CRIANDO OS OBJETOS DO TIPO LIVRO
        Livro l1 = new Livro(1,"Livro GIS");
        Livro l2 = new Livro(2,"Livro ATOS");
        Livro l3 = new Livro(3,"Livro Java");
        Livro l4 = new Livro(4,"Livro C#");

        // CRIANDO OS OBJETOS DO TIPO USUARIO
        Usuario u1 = new Usuario(1,"Felipe");
        Usuario u2 = new Usuario(2,"Daphne");

        /*
            ADICIONANDO CADA LIVRO A LISTA DA BIBLIOTECA ATRAVÉS DO MÉTODO adicionarLivro()
            ESSE MÉTODO FAZ PARTE DA CLASSE BIBLIOTECA

        */
        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);
        biblioteca.adicionarLivro(l4);

        /*
            LISTANDO TODOS OS NOMES DE LIVROS CADASTRADOS ATRAVÉS DO MÉTODO listasNomesTodosLivros()
            ESSE MÉTODO FAZ PARTE DA CLASSE BIBLIOTECA
        */
        biblioteca.listarNomesTodosLivros();

        // EMPRESTANDO UM LIVRO PARA O USUÁRIO, PASSANDO O OBJETO LIVRO lx E USUARIO ux COMO PARÂMETROS
        biblioteca.emprestarLivro(l1, u1);
        biblioteca.emprestarLivro(l2, u1);
        biblioteca.emprestarLivro(l3,u2);
        biblioteca.emprestarLivro(l1,u2);

        // VERIFICANDO SE O STATUS DE DISPONIBILIDADE DO LIVRO FOI ALTERADO APÓS O EMPRÉSTIMO
        System.out.println("Verificando disponibilidade do " + l1.getNomeLivro());
        biblioteca.verificaDisponibilidadeLivro(l1);
        System.out.println("Verificando disponibilidade do " + l4.getNomeLivro());
        biblioteca.verificaDisponibilidadeLivro(l4);

        // LISTANDO OS LIVROS EMPRESTADOS PARA OS USUARIOS
        u1.listaLivrosEmprestadosUsuario();
        u2.listaLivrosEmprestadosUsuario();

        // DEVOLUCAO DO LIVRO
        biblioteca.devolverLivro(l1,u1);

        // LISTANDO OS LIVROS EMPRESTADOS PARA O USUARIOS l1
        u1.listaLivrosEmprestadosUsuario();

        // VERIFICANDO SE O STATUS DE DISPONIBILIDADE DO LIVRO FOI ALTERADO
        biblioteca.verificaDisponibilidadeLivro(l1);
    }
}
