fun main() {

    val ariel = Estudante("Ariel", "Silva", 1012, 100.0, 5)
    val bernardo = Estudante("Bernardo", "Ferraz", 1013, 60.0, 2)
    val bianca = Estudante("Bianca", "Souza", 1014, 90.0, 3)

    ariel.nomeCompleto()
    ariel.passaDeAno()


    val historia = Cursos("História", "Pedro", 2 )


    historia.cadastrar(ariel)
    val estudantes : Array<Estudante?> = arrayOf(bernardo, bianca)

    historia.cadastrar(estudantes)
    historia.totalEstudantes()
    historia.melhorNota()
    historia.mostraEstudantes()



}