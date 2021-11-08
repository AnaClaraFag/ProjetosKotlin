import kotlin.math.min

open class Funcionario (val nome:String, val sobrenome: String,
                        val registro: Int, var idade: Int,
                        var diasTrabalhados: Int, var ferias: Int,
                        var salario: Double, var anosTrabalhados: Int ){

    fun aposentadoria(): Int {
        var aposenta = min(60 - idade, 40 - anosTrabalhados)
        return aposenta
    }

    fun feriasRest(): Int {
        var feriasRest = (diasTrabalhados/360) * (30 - ferias)
        return feriasRest
    }

    fun calculoBonus(): Double {
        return 2.2 * salario
    }

}