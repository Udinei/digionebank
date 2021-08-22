package one.digitalInnovation.digionebank

import java.math.BigDecimal

fun main(){
    val jether = Pessoa(nome= "Jether Rodrigues", cpf="1231231231")

     println(jether.nome)
     println(jether.cpf)

    val joao  = Funcionario("João Fernandes", "111111122222256", BigDecimal.valueOf(2000.0))

    println(joao.nome)
    println(joao.cpf)
}