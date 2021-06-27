package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main(){
    val lucia = Gerente(nome = "Lúcia Silva", cpf = "123456789", 4000.0, senha = "senha")

    ImprimeRelatorioFuncionario.imprime(lucia)

    TesteAutenticacao().autentica(lucia)
}