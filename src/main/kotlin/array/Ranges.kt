package array

fun main() {

    val rangeTo = 1.rangeTo(10)

    for(s in rangeTo) {
        print("$s ")
    }

    println()
    val intRange = 0..100 step 2

    intRange.forEach{ i ->
        print("$i ")
    }

    println()

    val intProgression = 100 downTo 0 step 2
    intProgression.forEach{ print("$it ") }

    println()

    val intProgression1 = 0.until(100) step 2
    intProgression1.forEach{ print("$it ") }

    val closedFloatingPointRange = 1500.0..5000.0
    val sal = 4000.0

    println()
    if(sal in closedFloatingPointRange) {
        println("Está dentro do intervalo")
    }else {
        println("nao está")
    }

    val alfabeto = 'a'..'z'
    val letra = 'K'

    println(letra in alfabeto)

}