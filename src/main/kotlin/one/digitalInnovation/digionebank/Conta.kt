package one.digitalInnovation.digionebank

import java.math.BigDecimal

/**
 * Data class - tecnica de armazenar informações na inicialização da classe e
 * essass informações não podem ser alterada ao longo da execução do programa,
 * para tanto pode ser copiado para manipulação
 */


// classe criada com construtor primario, os atributos sao passados como parametros
class Conta (val agencia: String, val numero: String,  val Saldo: BigDecimal){

    fun deposito(valor:BigDecimal){

    }

    fun saque(valor: BigDecimal){

    }

}