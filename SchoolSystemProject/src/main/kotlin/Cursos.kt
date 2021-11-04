class Cursos (val nomeDoCurso: String , var professore:String, var anoDoCurso:Int){


        val listaDeAlunos = mutableListOf<Estudante>()

        fun mostraEstudantes (){
                for (i in listaDeAlunos){
                        println("Lista: ${i?.primeiroNome}")
                }
        }

        fun cadastrar (estudante: Estudante){
        listaDeAlunos.add(estudante)
          println("Estudante cadastrade com sucesso!")
        }

        fun cadastrar (estudantes: Array<Estudante?>){
            if(estudantes != null) {
                 for (i in estudantes) {
                         listaDeAlunos.add(i!!)
                 }
            }
                println("Estudantes cadastrades com sucesso!")
        }

        fun cancelaCadastro(estudante: Estudante){
                if(listaDeAlunos.contains(estudante)){
                listaDeAlunos.remove(estudante)
                println("Estudando removido com sucesso!")
                }else{
                println("Esse estudante não está cadastrade")
                }

        }

        fun totalEstudantes (){
                println("Essa lista tem ${listaDeAlunos.size} estudantes.")
        }

        fun melhorNota(){
                var maiorNota = listaDeAlunos[0].nota
                for (i in listaDeAlunos){
                        if(i.nota > maiorNota){
                                maiorNota = i.nota
                        }
                }
                println("A melhor nota desse curso foi $maiorNota.")
        }
}