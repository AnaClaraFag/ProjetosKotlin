fun main(args: Array<String>) {
   /*
   Crie um programa que leia um número do teclado até que encontre um número igual a zero.
    No final, mostre:
    - A soma dos números digitados.
    - A média deles
    - O menor número digitado
    - O maior número digitado
    */

    var num = 0
    var soma = 0.0
    var media = 0.0
    var cont = 0
    var menor = 0
    var maior = 0

    do{
        println("Digite um número ")
        num = readLine()!!.toInt()


        if(cont == 0){
            maior = cont
            menor = cont

        }else if(num < menor && num != 0 ){
            menor = num
        }else if(num > maior) {
            maior = num
        }

        soma += num
        cont++

       } while (num != 0 )
        media = soma/cont
        cont = cont - 1
        println("Soma $soma, Média $media e quantidade de números: $cont")

}
