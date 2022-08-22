class Patinete(
    var rodas: String,
    var marca: String,
    var cor: String,
    var preco: Double  ) {

    var eletrico = false
    constructor(
        rodas: String,
        marca: String,
        cor: String,
        preco: Double,
        eletrico: Boolean
    ):this(rodas,marca, cor, preco){
        this.eletrico = eletrico
        if(eletrico) {
            println("Criando um patinete eletrico")
        }
    }

    fun exibirInformacoes (){
        println("marca: $marca")
        println("cor: $cor")
        println("preço: $preco")
        println("rodas: $rodas")
        println("Eletrico: $eletrico")
    }

    fun pintarPatinente(novaCor: String): String{
        if(this.cor == novaCor){
            return "Patinete já é dessa cor"
        }
        this.cor = novaCor
        return "cor do patinete modificada para $novaCor"
    }
    fun mudarPreco(valor: Double): String{
        if(this.preco <= valor){
            this.preco = valor
            return "Patinete valorizado"
        }
        this.preco = valor
        return "Patinete desvalorizado"
    }
}



