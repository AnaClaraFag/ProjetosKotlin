package Cursos

import Estudantes.Estudante

class Cursos (private val nomeDoCurso: String, private var professore:String, private var anoDoCurso:Int){


        private val listaDeAlunos = mutableListOf<Estudante?>()

        fun mostraEstudantes (){
                for (i in listaDeAlunos) println("lista: ${i?.primeiroNome}")
        }


        fun verificaEstudante(estudante: Estudante?) {
                if (listaDeAlunos.contains(estudante)) {
                        println("Esse alune existe na lista")
                } else {
                        throw Exception("Esse alune não existe na lista")
                }
        }


        fun cadastrar (estudante: Estudante){
        listaDeAlunos.add(estudante)
          println("Estudantes.Estudante cadastrade com sucesso!")
        }

        fun cadastrar (estudante: Array<Estudante?>){
            if(estudante != null) {
                    for (i in estudante)
                    listaDeAlunos.add(i)

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

        fun melhorNota() {
                var maiorNota = listaDeAlunos[0]?.nota
                for (i in listaDeAlunos){
                        if(i?.nota!! > maiorNota!!){
                                maiorNota = i.nota
                        }
                }
                println("A melhor nota desse curso foi $maiorNota.")
        }
}

