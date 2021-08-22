package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco("DigOne", 11)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 =  digiOneBank.copy("Banco2") // copiando objeto data class para alteração


    println(banco2.nome)
    println(banco2.numero)
    println(banco2.info())
}