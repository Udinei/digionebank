package one.digitalInnovation.digionebank

fun main(){

    ClienteTipo.values().forEach { elemento ->
      println("${elemento.name} - ${elemento.descricao}")// se chamar alguma propriedade tem que usar {}

    }

    ClienteTipo.values().forEach{
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descricao}")
}