package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main(){
    val joao = Analista(nome = "João", cpf = "123456789", 2000.0)
    //println("Nome: ${joao.nome}")
    //println("CPF: ${joao.cpf}")
    //println("Salário: R$ ${joao.salario}")

    ImprimeRelatorioFuncionario.imprime(joao)
}