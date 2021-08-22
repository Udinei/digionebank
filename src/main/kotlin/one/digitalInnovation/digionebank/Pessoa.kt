package one.digitalInnovation.digionebank

class Pessoa {
    // private - modificaddor de visibiliade
    var nome: String = "Jether"
    //private var cpf: String = "123.123.123-15" // visivel somente no scopo da classe
    var cpf: String = "123.123.123-15"
    //private set // somente o metodo set da classe é privado, nao pode ser alterado de fora da classe

    // recurso de classe interna
    inner class Endereco{
        var rua: String = "Rua teste"
    }
}

fun main(){
    val jether = Pessoa()
    println(jether)
    // jether.cpf = "123.123.123-15" // alterando o valor de fora da classe por isso tem que usar o metodo private na classe
    println(jether.nome)
    println(jether.cpf)

    println(jether.Endereco().rua)

}