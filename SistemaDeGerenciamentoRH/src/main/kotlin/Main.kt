fun main(args: Array<String>) {

    val maria = RepDeVendas("Maria", "Prado", 115, 52, 22, 1,
        1500.00, 10, 2000.00 )
    val joao = RepDeVendas("João", "Pereira", 121, 35, 22, 5,
        1500.00, 10, 1000.00)
    val pedro = RepDeVendas("Pedro", "Alves", 156, 42, 22, 2,
        1500.00, 10, 1200.00 )
    val suelen = GerenteDeVendas("Suelen", "Melo", 147, 40, 25, 0,
        3000.00, 15, 0.0)


    println("Dados Funcionária")
    println(pedro.calculaComissao())
    println(pedro.aposentadoria())
    println(pedro.feriasRest())
    println(pedro.calculoBonus())

    suelen.addRepVenda(maria)
    suelen.addRepVenda(pedro)
    suelen.addRepVenda(joao)

    println(suelen.calculaComissaoGen())



}

