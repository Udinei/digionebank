package one.digitalInnovation.digionebank

import one.digitalInnovation.digionebank.testes.ImprimeRelatorioFuncionario

fun main(){
    val maria = Gerente("Maria do Carmo", "64646775499", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}


