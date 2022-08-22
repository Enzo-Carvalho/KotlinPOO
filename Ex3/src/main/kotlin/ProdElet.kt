class ProdElet(
    var nome: String,
    var preco: Double,
    var info: String
) {
    fun consultarPreco() {
        println("O Preço do produto é R$$preco")
    }

    fun valorComDesconto(valor: Double) {
        if (preco > 0.0 && valor <= preco) {
            preco -= valor
            println("Desconto realizado com sucesso!")
        } else {
            println("Desconto impossível de ser realizado!")
        }
    }
}

