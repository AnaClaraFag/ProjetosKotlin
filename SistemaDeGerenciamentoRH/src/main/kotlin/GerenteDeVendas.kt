class GerenteDeVendas (nome:String, sobrenome: String,registro: Int, idade: Int,
                       diasTrabalhados: Int, ferias: Int,salario: Double, anosTrabalhados: Int,
                       vendasFeitas: Double):
                        RepDeVendas(nome, sobrenome,registro, idade, diasTrabalhados, ferias,
                            salario, anosTrabalhados, vendasFeitas){


    val equipeRep = hashMapOf<Int, RepDeVendas>()

    fun addRepVenda(repDeVendas: RepDeVendas){
        equipeRep.put(repDeVendas.registro, repDeVendas)
        println("Representante ${repDeVendas.nome} foi adicionade à equipe")
    }


    fun calculaComissaoGen() {
        var totalVendas: Double = 0.0
        if(equipeRep.isEmpty()){
            println("Não há Representantes de Vendas na equipe.")
        }else{
            for (item in equipeRep){
                totalVendas += item.value.vendasFeitas
            }
        }
        var comissaoGen = 0.03 * totalVendas
        println("A comissão com base nas vendas realizadas pela equipe é $comissaoGen")
    }
}






