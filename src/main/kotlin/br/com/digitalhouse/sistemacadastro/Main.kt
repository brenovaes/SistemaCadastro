package br.com.digitalhouse.sistemacadastro

fun main() {

    val aluno1 = Aluno(123, "José", "Silva")
    val aluno2 = Aluno(124, "João", "Santos")

    println(aluno1)
    println(aluno2)

    val materia1 = Materia("Introdução")
    val materia2 = Materia("Kotlin")

    println(materia1)
    println(materia2)

    val aula1 = Aula(materia1, "09:00", "12:30")
    val aula2 = Aula(materia2, "12:40", "14:10")

    println(aula1)
    println(aula2)

    val professor1 = Professor("Marcos", "5511")

    println(professor1)

    val listaAulas = mutableListOf<Materia>()
    listaAulas.add(materia1)
    listaAulas.add(materia2)

    println(listaAulas)

    val listaAlunos = mutableListOf<Aluno>()
    listaAlunos.add(aluno1)
    listaAlunos.add(aluno2)

    println(listaAlunos)

    val curso1 = Curso("Android", listaAulas, listaAlunos, professor1)

    println(curso1)

    val turma1 = Turma("Turma da tarde", curso1)

    println(turma1)
}