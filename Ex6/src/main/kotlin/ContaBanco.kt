class ContaBanco (
    var titular: String,
    var agencia: String,
    val conta: String,
    var saldo: Double
) {

    //Declarando os métodos

    fun consultarSaldo(){
        println("O saldo da conta é R$$saldo")
    }

    fun saque(valor: Double){
        if(saldo > 0.0 && valor <= saldo){
            saldo -= valor
            println("Saque de R$$valor realizado com sucesso!")
        }else{
            println("Saque de R$$valor impossível de ser realizado!")
        }
    }

    fun deposito(valor: Double){
        if(valor > 0.0){
            saldo += valor
            println("Deposito de R$$valor realizado com sucesso!")
        }else{
            println("Deposito de R$$valor impossível de ser realizado!")
        }
    }

}