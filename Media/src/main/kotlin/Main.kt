fun main(args: Array<String>) {
  /*
  3 - Crie um programa para ler 4 notas e mostrar a média delas.
   */

    var nota = 0.0
    var media = 0.0
    var soma = 0.0
    var i = 1

    while(i in 1..4){

        println("Digite uma nota: ")
        nota = readLine()!!.toDouble()
        soma += nota
        i++

    }
    media = soma/4
    println("A média dessas notas é: $media")
}