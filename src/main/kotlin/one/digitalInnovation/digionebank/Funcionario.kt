package one.digitalInnovation.digionebank

import java.math.BigDecimal

// classes abstract nunca serão trafegadas como instancia
//
abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double

) : Pessoa(nome, cpf) {
   // somente a classe funcionario e classes filhas podem acessar esse metodo protected
   protected abstract  fun calculoAuxilio(): Double; // compartamento espeficido por tipo de funcionarios

    // sobreescrevendo a fun toString da classe funcionario
    override fun toString(): String =  """
     Nome: $nome
     Cpf: $salario
     Auxilio: ${calculoAuxilio()}

    """.trimIndent()
}