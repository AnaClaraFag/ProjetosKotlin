fun main(args: Array<String>) {


    var comis = 0.0
    var venda = 0.0

    print("Para saber o valor da comissão, digite o valor da venda em reais: ")
    venda = readLine()!!.toDouble()

    if(venda >= 10000){
        comis = venda * 0.3
        println("Sua comissão é de R$$comis")
    }else if(venda <= 9999 && venda >= 5000){
        comis = venda * 0.2
        println("Sua é comissão é de R$$comis")
    }else if(venda <= 4999 && venda > 1000){
        comis = venda * 0.1
        println("Sua comissão é de R$$comis")
    }else{
        println("Para vendas nesse valor não há comissão")
    }
}

