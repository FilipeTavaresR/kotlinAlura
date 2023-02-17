package array

import java.math.BigDecimal

fun Array<BigDecimal>.somar(): BigDecimal {
    return this.reduce{acc,valor ->
        println("Acumulador: $acc / Valor: $valor")
        acc + valor}
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somar() / this.size.toBigDecimal()
    }
}