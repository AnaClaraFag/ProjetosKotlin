fun main(args: Array<String>) {

    var num = 0

    print("Digite um número para descobrir a tabuada de 1 a 10: ")
    num = readLine()!!.toInt()

    for(i in 1..10){

        println("$num X $i = ${num * i}")
    }

    for(i in 10 downTo 1){

        println("$num X $i = ${num * i}")

    }
}