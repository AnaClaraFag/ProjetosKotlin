fun main(args: Array<String>) {
   /*
   2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares.
    */

    var num = 0
    var par = 0
    var impar = 0


   for (i in 1..10) {
       println("Digite dez números. $i º: ")
       num = readLine()!!.toInt()

       if(num % 2 == 0){
           par++
       }else{
           impar++
       }
    }

    println("Quantidade de números pares: $par, e impares: $impar")
}