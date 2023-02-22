package list

fun main() {

    listaDeLivrosComNulos.imprimeComMarcadores()

    listaDeLivros
        //elvis operator toda vida que for null a esquerda do ?: acontece o que está na direita
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }


}