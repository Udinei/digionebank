package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {

    // content code - metodo statico invocado via classe, e não via instancia
    companion object {
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}