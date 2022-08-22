fun main() {

  val televisao = ProdElet("Smart TV 43 Full HD LED LG 43LM6370 60Hz", 2799.90, "O Full HD é o futuro da definição de imagem")
    println("Produto: ${televisao.nome} \nPreço: ${televisao.preco} \nInformações do produto: ${televisao.info}")

  televisao.consultarPreco()

  televisao.valorComDesconto(500.0)

  televisao.consultarPreco()

}