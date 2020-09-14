package digitalhouse

class Professor(var nome: String, var rd: String){

    var listaAulas = mutableListOf<aulas>()

    fun realizarAula(){
        println("Aula de ...")
    }
    fun realizarChamada(){
        println("Alunos ...")
    }
}
