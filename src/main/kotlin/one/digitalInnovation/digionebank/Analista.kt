package one.digitalInnovation.digionebank

import java.math.BigDecimal
// : sinaliza que a classe Analista herda a classe a direita dos dois pontos
// em seu metodo primário deve conter alem dos atributos herdados pode ter seus proprios atributos
// não é necessario informar o tipo o modificador de acesso do atributo herdado
class Analista(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario){
    override fun calculoAuxilio() = salario  * 0.1
}