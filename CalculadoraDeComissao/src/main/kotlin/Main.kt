fun main(args: Array<String>) {
    /*
     Exercício 2
    1 - Crie um projeto chamado Calculadora de Comissão
    2 - O App deve calcular a comissão dos representantes de vendas com base neste gráfico usado pela loja de varejo:

    Faixa de Vendas        Comissão
    acima de R$10000        30%
    R$5001 - R$9999         20%
    R$1001 - R$4999         10%
    abaixo de R$1000        N / D
 */

    var comis = 0.0
    var venda = 0.0

    print("Para saber o valor da comissão, digite o valor da venda em reais: ")
    venda = readLine()!!.toDouble()

    if(venda > 10000){
        comis = venda * 0.3
        println("Sua comissão é de R$$comis")
    }else if(venda <= 9999 && venda > 5000){
        comis = venda * 0.2
        println("Sua é comissão é de R$$comis")
    }else if(venda <= 4999 && venda > 1000){
        comis = venda * 0.1
        println("Sua comissão é de R$$comis")
    }else{
        println("Para vendas nesse valor não há comissão")
    }
}

