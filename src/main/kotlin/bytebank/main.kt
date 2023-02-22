package bytebank

fun main() {
    print("Hello World")


}

class Conta {
    val numero = 0
    val titular = ""
    var saldo = 0.0
        //apenas exemplo de como usar e personalizar as properties
        private set(valor) {
            if (valor > 0) field = valor
        }
}