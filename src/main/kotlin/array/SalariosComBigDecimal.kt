package array

import java.math.BigDecimal
import java.math.RoundingMode



fun main() {

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salarios
        .map { salario ->
            calculaAumentoRelativo(salario, aumento)
        }
        .toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somar()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acc, salario ->
        acc + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    val salariosOrdenados = salariosComAumento.sorted()

    val tresUltimosSalarios = salariosOrdenados.takeLast(3).toTypedArray()

    val media = tresUltimosSalarios.media()
    println(media)
}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500.00".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array<BigDecimal>(valores.size) {i ->
    valores[i].toBigDecimal()
    }
}

