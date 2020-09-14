package br.com.digitalhouse.sistemacadastro

fun main() {

    val aluno1 = Aluno(123, "José", "Silva")
    val aluno2 = Aluno(124, "João", "Santos")

    println("--------  Lista de alunos:  --------")
    println("O aluno ${aluno1.nome} ${aluno1.sobrenome} tem RA ${aluno1.ra}")
    println("O aluno ${aluno2.nome} ${aluno2.sobrenome} tem RA ${aluno2.ra}")

    val materia1 = Materia("Introdução")
    val materia2 = Materia("Kotlin")

    println("--------  Lista de matérias:  --------")
    println("Matéria ${materia1.nome}")
    println("Matéria ${materia2.nome}")

    val aula1 = Aula(materia1, "09:00", "12:30")
    val aula2 = Aula(materia2, "12:40", "14:10")

    println("--------  Lista de aulas:  --------")
    println("${aula1.materia.nome} tem início às ${aula1.horarioInicio} e término às ${aula1.horarioTermino}")
    println("${aula2.materia.nome} tem início às ${aula2.horarioInicio} e término às ${aula2.horarioTermino}")


    val professor1 = Professor("Marcos", "5511")

    println("--------  Professor:  --------")
    println(professor1.nome)


    val listaAulas = mutableListOf<Materia>()
    listaAulas.add(materia1)
    listaAulas.add(materia2)

    println("------------------------")
    println("Aulas em andamanto: ")
    for (aula in listaAulas){
        println(aula.nome)
    }

    println("------------------------")
    println("Alunos nas aulas: ")
    val listaAlunos = mutableListOf<Aluno>()
    listaAlunos.add(aluno1)
    listaAlunos.add(aluno2)

    for (aluno in listaAlunos){
        println(aluno.nome)
    }

    val curso1 = Curso("Android", listaAulas, listaAlunos, professor1)

    //println(curso1.nome)

    val turma1 = Turma("Turma da tarde", curso1)

    //println(turma1.nomeTurma)

    professor1.realizarAula()
    professor1.realizarChamada()
}