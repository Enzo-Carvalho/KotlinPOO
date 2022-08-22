fun main() {

    val conta1 = ContaBanco("Cassio", "12445", "5612", 1000.0)
    println("Titular: ${conta1.titular}\nAgencia: ${conta1.agencia}\nConta: ${conta1.conta} \nSaldo: ${conta1.saldo}")

    conta1.consultarSaldo()

    conta1.saque(500.0)

    conta1.consultarSaldo()

    conta1.deposito(1500.0)

    conta1.consultarSaldo()

}
