fun main(args: Array<String>) {
  /*
  Exercício 3
    Um cinema aplica descontos dependendo da idade do cliente.
    1 - Crie um projeto chamado DescontosCinema
    2 - O App pede para um usuário digitar a sua idade e checa se ele está apto para o deconto do ingresso.
    A tabela de descontos é a seguinte:
    Idade                 Preço do Ingresso
    Ingresso inteiro         18 Reais
    Abaixo de 5 anos        60% de Desconto
    Acima de 60 anos        55% Discount
    3 - Codifique o app para calcular o preço correto do ingresso com base na idade e mostre esse retorno para o usuário.
    4 - Caso o usuário não tenha desconto, crie um sistema para a quantidade de ingressos que ele quer e,
     se ele comprar dois ingressos ou mais, terá um desconto de 30% em cada um.
   */
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
        }
    }

}