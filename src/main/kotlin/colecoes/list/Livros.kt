package colecoes.list

val listaDeLivros: MutableList<Livro> = mutableListOf(

    Livro(
        titulo = "A volta dos que não foram",
        autor = "Filipe",
        anoPublicacao = 1996
    ),
    Livro(
        titulo = "Poeira em alto mar",
        autor = "Matias padilha",
        anoPublicacao = 2008,
        editora = "Abril"
    ),
    Livro(
        titulo = "As tranças de um careca",
        autor = "José guerra",
        anoPublicacao = 1905
    )
)

val listaDeLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "A volta dos que não foram",
        autor = "Filipe",
        anoPublicacao = 1996
    ),
    null,
    Livro(
        titulo = "Poeira em alto mar",
        autor = "Matias padilha",
        anoPublicacao = 2008,
        editora = "Abril"
    ),
    Livro(
        titulo = "As tranças de um careca",
        autor = "José guerra",
        anoPublicacao = 1905
    )
)