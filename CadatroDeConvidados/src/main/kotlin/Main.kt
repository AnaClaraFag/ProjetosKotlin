fun main(args: Array<String>) {
  
    var escolha = 0
    var simNao = "Sim"
    val convidados = mutableListOf<String>("Joana", "Carol", "Jenifer")
    var nome = ""

    while(simNao == "Sim") {

        println("Número 1 para Adicionar convidado " +
            "\nNúmero 2 para remover convidado" +
            "\nNúmero 3 para vizualizar a lista." +
            "\nDigite o número da opção desejada: ")


        escolha = readLine()!!.toInt()


    when (escolha) {

        1 -> {
            println("Digite o nome do convidado para adicinar à lista: ")
            nome = readLine()!!
            convidados.add(nome)
            println("Contato adicionado a lista!")
        }
        2 -> {
            println("Digite o nome do convidado que será retirado da lista: ")
            nome = readLine()!!

            if (convidados.contains(nome)) {
                convidados.remove(nome)
                println("Convidado removido!")
            }else{
                println("Este convidado não consta na lista!")
            }
        }
        3 -> {
            println(convidados)
             }

        else ->{ println("Opção Inválida")}
        }

        println("Deseja acessar o menu novamente? ")
        simNao = readLine()!!
    }
}