import kotlin.math.pow

fun main(args: Array<String>) {

    var num1 = 0
    var num2 = 0

    println ("Digite um número: ")
    num1 = readLine()!!.toInt()

    println ("Digite outro número: ")
    num2 = readLine()!!.toInt()

    println("A soma desses valores é ${soma(num1, num2)}")
    println("A subtração desses valores é ${sub(num1, num2)}")
    println("A multiplicação é: ${mult(num1, num2)}")
    println("A divisão é ${divi(num1, num2)}")
    println("O número $num1 elevado a $num2 é igual a ${pote(num1.toDouble(), num2.toDouble())}")

}

fun soma (num1:Int, num2:Int) = num1 + num2
fun sub (num1:Int, num2:Int) = num1 - num2
fun mult (num1: Int, num2: Int) = num1 * num2
fun divi (num1: Int, num2: Int) = num1 / num2
fun pote (num1: Double, num2:Double) = num1.pow(num2)