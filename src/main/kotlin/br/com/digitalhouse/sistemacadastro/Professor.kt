package br.com.digitalhouse.sistemacadastro

class Professor(var nome: String, var rd: String): Docente {

    override fun realizarAula(){
        println("$nome está dando aula..")
    }

    override fun realizarChamada(){
        println("$nome está fazendo chamada dos alunos")
    }

}
