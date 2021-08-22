package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Analista

fun main(){

    val joao = Analista(nome= "Joao Pedro", cpf="1231231231", 2000.00)
    ImprimeRelatorioFuncionario.imprime(joao)
  }

