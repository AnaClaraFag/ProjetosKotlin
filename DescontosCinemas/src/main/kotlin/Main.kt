fun main(args: Array<String>) {

    var desc = 0.0
    var idade = 0
    var ingre = 18.0
    var valor = 0.0

    print("Digite sua idade para saber o valor do seu ingresso: ")
    idade = readLine()!!.toInt()

    if(idade < 5){
        desc = ingre * 0.6
        valor = ingre - desc
        println("O valor do ingresso para essa idade é R$$valor")
    }else if(idade > 60){
        desc = ingre * 0.55
        valor = ingre - desc
        println("O valor do ingresso para essa idade é R$$valor")
    }else {
        println("Nesse caso não há desconto por idade")
        println("Você pode obter desconto por quantidade de ingressos. Digite quantos ingressos você precisa: ")
        var qtd = readLine()!!.toInt()
        if(qtd >= 2){
            desc = ingre * 0.3
            valor = ingre - desc
            var total = valor * qtd
            println("Para $qtd ingressos o valor de cada ingresso é R$$valor, totalizando R$$total")
        }else{
            println("Não tem desconto")
        }
    }

}