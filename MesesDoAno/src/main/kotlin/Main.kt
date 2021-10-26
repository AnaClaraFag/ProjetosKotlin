fun main(args: Array<String>) {
 /*
 Exercício 4
Criarem uma estrutura de when em que consigamos passar um número inteiro entre 1 e 12.
O programa precisará, então, retornar o mês referente ao número digitado
  */

    var num = 0

    print("Digite um número para ver qual o mês correspondente: ")
    num = readLine()!!.toInt()

    when(num){
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7-> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")

        else ->println("Número inválido")

    }
}