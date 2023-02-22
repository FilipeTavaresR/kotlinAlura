package colecoes.array

fun main() {

    val idade1 = 25
    val idade2 = 19
    val idade3 = 33

    val maiorIdade = if (idade1 > idade2 && idade1 > idade3) {
        idade1
    } else if (idade2 > idade3) {
        idade2
    } else {
        idade3
    }

    println(maiorIdade)


//    val intArray = IntArray(4)
//    intArray[0] = 25
//    intArray[1] = 19
//    intArray[2] = 33
//    intArray[3] = 20

    val intArray = intArrayOf(25, 19, 33, 20, 55, 40)

    var idadeMaisVelho = 0
    for (idade in intArray) {
        if (idade > idadeMaisVelho) {
            idadeMaisVelho = idade
        }
    }
    println(idadeMaisVelho)

    var menorIdade = Int.MAX_VALUE
    intArray.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)


}