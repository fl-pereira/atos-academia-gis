

## **ALGORITMO PARA BIBLIOTECA**



**CLASSE LIVRO**

*1a.* Criar classe **Livro**, com os atributos **id** *(Integer)*, **nomeLivro** *(String)*, **livroEmprestado** *(boolean)*;

*1b.* Criar o construtor da classe **Livro**;

*1c.* Criar os getters e setters da classe **Livro**.



**CLASSE USUARIO**

*2a.* Criar a classe **Usuario**, com os atributos **id** *(Integer)* e **nomeUsuario** *(String)* e **livrosEmprestados** *(List<Livro>)*;

*2b.* Criar o construtor da classe **Usuario**;

*3c.* Criar os getters e setters da classe **Usuario**.



**CLASSE BIBLIOTECA**

*3a.* Criar a classe **Biblioteca**, com os atributos **nomeBiblioteca** *(String)*, **listaLivros** *(List<Livro>)*, **listaUsuarios** *(List<Usuario>)*;

*3b.* Criar o construtor da classe **Biblioteca**;

*3c.* Criar os getters e setters da classe **Biblioteca**;

*3d.* Criar o método **adicionarLivro()** para adicionar um livro ao acervo, recebendo um objeto do tipo livro e adicionando a **listaLivros**;

*3e.* Criar o método **emprestarLivro()** para emprestar o livro a um usuário, adicionando a lista **livrosEmprestados** o objeto livro e adicionando true em **livroEmprestado**;

*3f.* Criar o método **devolverLivro()** para executar devolução do livro ao acervo, removendo o objeto livro de **livrosEmprestados** e adicionado false em **livroEmprestado**;

*3g.* Criar método **verificarDisponibilidadeLivro()** para consultar se o livro está disponível para empréstimo, verificando se é true ou false em **livroEmprestado**;

*3h.* Criar método **listarLivrosEmprestados()** para consultar todos os livros onde **livroEmprestado** = false.