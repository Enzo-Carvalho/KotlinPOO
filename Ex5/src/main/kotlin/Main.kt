fun main() {
    val patinete1 = Patinete("Metal","Caloi", "Azul",400.0,true)

    patinete1.exibirInformacoes()
    println()

    val patinete2 = Patinete("Metal","Caloi", "Azul",400.0,false)

    patinete2.exibirInformacoes()
    println()
    println(patinete2.pintarPatinente("Vermelho"))
    println()
    patinete2.exibirInformacoes()
    println()
    println(patinete2.mudarPreco(300.0))


}