package colecoes.list

data class Prateleira(
    val genero: String,
    var livros: List<Livro>
) {
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }.toMutableList()
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }.toMutableList()
    }
}
