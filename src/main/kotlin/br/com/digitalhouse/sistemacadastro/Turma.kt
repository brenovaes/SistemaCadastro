package br.com.digitalhouse.sistemacadastro

open class Turma (var nomeTurma: String = "", var curso: Curso){
    init {
        println("Turma: $nomeTurma Curso: $curso")
    }
}