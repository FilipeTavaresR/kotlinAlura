package list

fun main() {
    val livro1 = Livro(
        titulo = "A volta dos que não foram",
        autor = "Filipe",
        anoPublicacao = 1996
    )

    val livro2 = Livro(
        titulo = "Poeira em alto mar",
        autor = "Matias padilha",
        anoPublicacao = 2008,
        editora = "Abril"
    )

    val livro3 = Livro(
        titulo = "As tranças de um careca",
        autor = "José guerra",
        anoPublicacao = 1905
    )

    val livros = mutableListOf(livro1, livro2, livro3)

    livros.add(
        Livro(
            titulo = "Lagoa azul",
            autor = "Jhon snow",
            anoPublicacao = 1855
        )
    )
    livros.imprimeComMarcadores()

    livros.remove(livro1)

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao = livros.sorted()

    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = listaDeLivros.sortedBy { it.titulo }

    ordenadoPorTitulo.imprimeComMarcadores()

    val titulos = livros
        .filter { it.autor.contains("Jh") }
        .map { it.titulo }

    println(titulos)


}

