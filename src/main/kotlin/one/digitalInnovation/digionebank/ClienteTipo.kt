package one.digitalInnovation.digionebank

// se não utilizar val no parametro, a classe que implementa o enum não vai pode pegar a descrição do enum
enum class ClienteTipo(val descricao: String) {
        PF("Pessoa Física"), // instancias da propria classe
        PJ("Pessoa Jurídica");

    }