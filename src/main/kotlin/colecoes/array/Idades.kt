package colecoes.array

fun main() {

    val idades = intArrayOf(10, 12, 18, 33, 40, 67)

    val maiorIdade = idades.maxOrNull()

    println("Maior idade: $maiorIdade")


    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("Média: $media")

    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores? $todosMaiores")

    val algumMaior = idades.any { it >= 18 }
    println("Todos maiores? $algumMaior")

    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    val busca = idades.find { it >= 18 }
    println("Busca: $busca")


}