package Estudantes
class Estudante( var primeiroNome:String? = null,private var sobrenome:String? = null ){

    private var matricula = 0
     var nota: Double = 0.0
    private var ano: Int = 0
    private val aprovacao: Boolean
    get() {
        return nota >= 60.0
    }

    fun nomeCompleto(){

        println("Alune: $primeiroNome $sobrenome")
    }

    fun passaDeAno() {
        if(aprovacao){
            ano += 1
            println("Parabéns, voce foi aprovade! Vai para o $ano º ano.")
        }else{
            println("Você reprovou! Permanece no $ano º ano.")
        }
    }

    constructor(primeiroNome: String, sobrenome: String?, matricula: Int):
         this(primeiroNome, sobrenome){
            this.matricula = matricula
    }

    constructor(primeiroNome: String, sobrenome: String?, matricula: Int, nota: Double, ano: Int):
            this(primeiroNome, sobrenome, matricula){
                this.nota = nota
                this.ano = ano
            }

    fun mostraNome(){
        println(nomeCompleto())
        var NomeDoEstudante = readLine()!!
    }
    fun mostraNota(){
        println(nota)
        var mostraNota = readLine()!!.toInt()
    }

 }














