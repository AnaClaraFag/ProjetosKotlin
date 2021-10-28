fun main(args: Array<String>) {

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