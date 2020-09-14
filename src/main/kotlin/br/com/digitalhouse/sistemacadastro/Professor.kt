package br.com.digitalhouse.sistemacadastro

class Professor(var nome: String, var rd: String): Docente {

    var listaAulas = mutableListOf<Aula>()

}
