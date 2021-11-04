import java.text.BreakIterator

fun main(args: Array<String>) {

    print("BEM VINDOS AO QUIZ DA ANA E DO GUILHERME" +
            "\n ESTÁ PREPARADO PARA JOGAR?? GO!!!" +
            " \n-----     -----" +
            "\n|     |   |     |" +
            "\n|  °  |   |  °  |" +
            "\n -----     -----" +
            "\n       [ ]       " +
            "\n   ___________  " +
            "\n  (___________) \n")


     println("\nVamos para a primeira pergunta: ")

    while (true){

        println("\nGuilheme iniciou Graduação em que curso? " +
                "\n 1 - Ciências contábeis " +
                "\n 2 - Gestão Financeira" +
                "\n 3 - Design de Interiores? ")
        var pergunta1 = readLine()!!.toInt()

        when(pergunta1){

            1 -> println("Você errou, é Gestão Financeira :(")
            2 -> println("Você acertou, é Gestão Financeira :)")
            3 -> println("Você errou, é Gestão Financeira :(")
        }
        print("Ir para a próxima pergunta? ")
        var proxPergunta1 = readLine()!!

        if (proxPergunta1 != "Sim"){
        break
        }

        println("\nQual era a segunda opção de graduação da Ana " +
                "\n 1 - Publicidade" +
                "\n 2 - Direito" +
                "\n 3 - Ciências politicas")
        var pergunta2 = readLine()!!.toInt()

        when(pergunta2){

            1 -> println("Você errou, é Direito :(")
            2 -> println("Você acertou, é Direito :)")
            3 -> println("Você errou, é Direito :(")
        }

        print("Ir para a próxima pergunta? ")
        var proxPergunta2 = readLine()!!

        if (proxPergunta2 != "Sim"){
            break
        }

        println("\nQual dessas comidas Guilherme não gosta? " +
                "\n 1 - Salame" +
                "\n 2 - Fígado" +
                "\n 3 - Beterraba? ")
        var pergunta3 = readLine()!!.toInt()

        when(pergunta3){

            1 -> println("Você Acertou, é Salame :)")
            2 -> println("Você errou, é Salame :(")
            3 -> println("Você errou, é Salame :(")
        }

        print("Ir para a próxima pergunta? ")
        var proxPergunta3 = readLine()!!

        if (proxPergunta3 != "Sim"){
            break
        }

        println("\nCidade que a Ana gostaria de conhecer" +
                "\n 1 - Paris" +
                "\n 2 - Nova York" +
                "\n 3 - Glasgow")
        var pergunta4 = readLine()!!.toInt()

        when(pergunta4){

            1 -> println("Você errou, é Glasgow :(")
            2 -> println("Você errou, é Glasgow :(")
            3 -> println("Você acertou!, é Glasgow :)")
        }

        print("Ir para a próxima pergunta? ")
        var proxPergunta4 = readLine()!!

        if (proxPergunta4 != "Sim"){
            break
        }


        println("\nQual Cidade o Guilherme mais deseja visitar futuramente? " +
                "\n 1 - Barcelona" +
                "\n 2 - Cancún" +
                "\n 3 - Nova York? ")
        var pergunta5 = readLine()!!.toInt()

        when(pergunta5){

            1 -> println("Você Acertou, é Barcelona :)")
            2 -> println("Você errou, é Barcelona :(")
            3 -> println("Você errou, é Barcelona :(")
        }

        print("Ir para a próxima pergunta? ")
        var proxPergunta5 = readLine()!!

        if (proxPergunta5 != "Sim"){
            break
        }

        println("\nQual o hobbie da Ana " +
                "\n 1 - Aprender novos idiomas" +
                "\n 2 - Desenhar" +
                "\n 3 - Cozinhar")
        var pergunta6 = readLine()!!.toInt()

        when(pergunta6){

            1 -> println("Você errou, é Cozinhar :(")
            2 -> println("Você errou, é Cozinhar :(")
            3 -> println("Você acertou, é Cozinhar :)")
        }

        print("Ir para a próxima pergunta? ")
        var proxPergunta6 = readLine()!!

        if (proxPergunta6 != "Sim"){
            break
        }

        println("\n2 Mentiras e 1 Verdade, sobre Guilherme: " +
                "\n 1 - Tem um gato branco chamado cuca e um gato cinza chamado levi" +
                "\n 2 - Foi assaltado por um idoso de moto e com uma camiseta do Bob Esponja" +
                "\n 3 - Já caiu quando criança, e levou 7 pontos no queixo ")
        var pergunta7= readLine()!!.toInt()

        when(pergunta7){

            1 -> println("Você errou, é Já caiu quando criança, e levou 7 pontos no queixo :(")
            2 -> println("Você errou, é Já caiu quando criança, e levou 7 pontos no queixo :(")
            3 -> println("Você acertou, é Já caiu quando criança, e levou 7 pontos no queixo :)")
        }

        print("Ir para a próxima pergunta? ")
        var proxPergunta7= readLine()!!

        if (proxPergunta7 != "Sim"){
            break
        }

        println("\n2 Mentiras e 1 Verdade, sobre Ana: " +
                "\n 1 - Já fiz 2 anos de aulas circo" +
                "\n 2 - Já frequentei escolinha de futebol na infância" +
                "\n 3 - Pratico corrida pelo menos 3 vezes por semana ")
        var pergunta8= readLine()!!.toInt()

        when(pergunta8){

            1 -> println("Você acertou, é Já fiz 2 anos de aulas de circo :)")
            2 -> println("Você errou, é Já fiz 2 anos de aulas de circo :(")
            3 -> println("Você errou, é Já fiz 2 anos de aulas de circo :(")
        }

        print("Ir para a próxima pergunta? ")
        var proxPergunta8 = readLine()!!

        if (proxPergunta8 != "Sim"){
            break
        }


        println("\nSobre Guilherme, é correto afirmar que: " +
                "\n 1 - Adora nadar, mas tem medo dos animais debaixo d'água" +
                "\n 2 - Adora o calor, e ama ficar tomando sol na laje" +
                "\n 3 - Tem muita vontade de andar de avião ")
        var pergunta9 = readLine()!!.toInt()

        when(pergunta9){

            1 -> println("Você errou, é Tem muita vontade de andar de avião :(")
            2 -> println("Você errou, é Tem muita vontade de andar de avião :(")
            3 -> println("Você acertou, é Tem muita vontade de andar de avião :)")
        }

        print("Ir para a próxima pergunta? ")
        var proxPergunta9 = readLine()!!

        if (proxPergunta9 != "Sim"){
            break
        }

        println("\n2 Mentiras e 1 Verdade, sobre Ana: " +
                "\n 1 - Nunca tive um cachorro" +
                "\n 2 - Tenho 3 gatos" +
                "\n 3 - Tive uma calopsita")
        var pergunta10= readLine()!!.toInt()

        when(pergunta10){

            1 -> println("Você errou, tenho 3 gatos :(")
            2 -> println("Você acertou, tenho 3 gatos :)")
            3 -> println("Você errou, tenho 3 gatos :(")
        }

        break
    }

    println("\nO JOGO ACABOU! ATÉ A PRÓXIMA! :D")


}

