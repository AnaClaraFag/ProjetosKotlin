import java.util.*

fun main(args: Array<String>) {
    /*Exercício 1

    1 - Crie um novo projeto chamado NomeandoVariaveis
    2 - Crie variáveis que armazenem o nome do usuário, idade, preferência de emprego, nacionalidade e tipo sanguíneo
    3 - Pense como você pode nomear essas variáveis para ficarem fáceis de serem identificadas
    4 - Use a idade do usuário para calcular o ano de seu nascimento, usando o ano atual como base (2021)
    5 - No fim, printe todos os valores no console, juntamente com o ano em que o usuário nasceu

    readLine()!! - armazena dado na variante
    */

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