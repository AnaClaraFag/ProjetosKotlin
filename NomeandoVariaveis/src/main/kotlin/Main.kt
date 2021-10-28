import java.util.*

fun main(args: Array<String>) {


    var nome = ""
    var idade = 0
    var empregoPref = ""
    var nacionalidade = ""
    var tipoSang = ""
    var leitura = Scanner(System.`in`)


    print("Digite seu nome: ")
    nome = leitura.next()

    print("Qual a sua idade? ")
    idade = leitura.nextInt()

    print("Qual sua preferência de emprego? ")
    empregoPref =  leitura.next()

    print("Qual sua nacionalidade? ")
    nacionalidade = leitura.next()

    print("Qual seu tipo sanguíneo? ")
    tipoSang = leitura.next()

    var anoDeNasc = 0

    anoDeNasc = 2021 - idade
    println("Você nasceu no ano $anoDeNasc")
}