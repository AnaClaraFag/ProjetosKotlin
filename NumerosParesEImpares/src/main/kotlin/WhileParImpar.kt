fun main(args: Array<String>) {

/*
4 - Crie um programa que leia 10 valores e identifique a quantidade de números pares e ímpares
*/

    var num = 0
    var par = 0
    var impar = 0
    var i = 1

    while(i<=10) {
        println("Digite um número: ")
        num = readLine()!!.toInt()
        i++
        if(num % 2 == 0 ){
            par++
        }else{
            impar++
        }
    }

    println("Quantidade de números pares: $par, e impares: $impar")
}