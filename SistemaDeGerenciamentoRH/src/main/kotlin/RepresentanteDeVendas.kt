open class RepDeVendas (nome:String, sobrenome: String,
                        registro: Int, idade: Int,
                        diasTrabalhados: Int, ferias: Int,
                        salario: Double, anosTrabalhados: Int,
                        var vendasFeitas: Double
                        ): Funcionario(nome, sobrenome, registro, idade,
                            diasTrabalhados, ferias, salario,anosTrabalhados) {

    fun calculaComissao(): Double {
        val comissaoRep = 0.1 * vendasFeitas
       return comissaoRep
    }
}