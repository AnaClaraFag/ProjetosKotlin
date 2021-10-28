fun main(args: Array<String>) {


    var nota1Bi = 0.0
    var nota2Bi = 0.0
    var nota3Bi = 0.0
    var nota4Bi = 0.0


    print("Digite sua nota (0 a 10) do 1º bimestre: ")
    nota1Bi = readLine()!!.toDouble()
    print("Digite sua nota (0 a 10) do 2º bimestre: ")
    nota2Bi = readLine()!!.toDouble()
    print("Digite sua nota (0 a 10) do 3º bimestre: ")
    nota3Bi = readLine()!!.toDouble()
    print("Digite sua nota (0 a 10) do 4º bimestre: ")
    nota4Bi = readLine()!!.toDouble()

    var media = (nota1Bi + nota2Bi + nota3Bi + nota4Bi)/4

    println("Suas notas foram: $nota1Bi, $nota2Bi, $nota3Bi e $nota4Bi, por tanto sua média é: $media ")

    if (media <= 4){
        println("Você está reprovado!")
    }else if (media > 4 && media <= 5){
        println("Sua situação é regular!")
    }else if(media > 5 && media <= 8){
        println("Sua situação é boa!")
    }else if(media > 8 && media <= 10){
        println("Parabéns! Suas notas estão excelentes!")
    }else{
        println("Média inválida")
    }
}
