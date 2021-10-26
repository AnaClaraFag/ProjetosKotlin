import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    /*Exercício 2

1 - Crie um projeto no IntelliJ com o nome CirculoAreaPerimetro
2 - Crie um código que pede para o usuário digitar o diâmetro de um círculo (que será uma variável do tipo Int) e
calcule a área e o perímetro (que serão Doubles).
4 - Faça uma conversão de tipos (de Int para Double) quando for calcular os resultados*/

    var diametro = 0
    var area = 0.00
    var perimetro = 0.00
    var pi = 3.14
    var raio = 0.00
    var leitura = Scanner(System.`in`)

    print("Digite o valor do diametro da circunferência: ")
    diametro = leitura.nextInt()

    perimetro = diametro * pi

    raio = diametro.toDouble() / 2
    area = pi * raio.pow(2)

    print("O perimêtro do circulo é $perimetro e a área é $area")


}