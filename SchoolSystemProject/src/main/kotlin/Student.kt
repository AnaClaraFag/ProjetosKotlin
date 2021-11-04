
class Estudante(var primeiroNome:String? = null,var sobrenome:String? = null ){

    var matricula:String? = null
    var nota: Double = 0.0
    var ano: Int = 0
    val aprovacao: Boolean
    get() {
        if(nota >= 60.0){
             return true
        }else{
            return false
        }
    }

    fun nomeCompleto(){

        println("Alune: $primeiroNome $sobrenome")
    }

    fun passaDeAno(): Int {
        if(aprovacao){
            ano += 1
            println("Parabéns, voce foi aprovade! Vai para o $ano º ano.")
        }else{
            println("Você reprovou! Permanece no $ano º ano.")
        }
        return 0
    }

    constructor(primeiroNome: String, sobrenome: String?, matricula: String?):
         this(primeiroNome, sobrenome){
            this.matricula = matricula
    }

    constructor(primeiroNome: String, sobrenome: String?, matricula: String?, nota: Double):
            this(primeiroNome, sobrenome, matricula){
                this.nota = nota
            }

    constructor(primeiroNome: String, sobrenome: String?, matricula: String?, nota: Double, ano: Int):
            this(primeiroNome, sobrenome, matricula, nota){
                this.ano = ano
    }
 }















