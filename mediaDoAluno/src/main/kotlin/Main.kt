fun main(args: Array<String>) {
  /*
  Exercício 1
    1 - Abra o IntelliJ e crie um projeto chamado MediaDoAluno
    2 - Crie um programa onde o usuário digite as notas referente a 4 bimestres e calcule a média. No final,
    verifique a situação do aluno com base nesses dados:
    - Reprovado se a média for 4 ou menos
    - Regular se a média for maior que 4 e menor ou igual a 5
    - Boa se a média for maior do que 5 e menor ou igual a 8
    - Excelente se a média for maior do que 8 e menor ou igual a 10
    - Se a média der um número negativo ou     uma nota fora da escala de 0 a 10, deverá ser printado média inválida
   */

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
