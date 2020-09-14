package br.com.digitalhouse.sistemacadastro

class Aluno(val ra:Int,val nome:String,val sobrenome:String) {

//    init {
//        println("teste")
//    }

    fun assistirAula(aula:Aula){
        println("O aluno: $nome $sobrenome, está assistindo a aula: $aula")
    }

    fun fazerLicaoDeCasa(){
        println("O aluno $nome,esta fazendo a lição")
    }

}