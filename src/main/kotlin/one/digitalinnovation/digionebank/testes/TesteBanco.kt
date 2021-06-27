package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println("Banco: ${digiOneBank.nome}")
    println("Número: ${digiOneBank.numero}")

    val digiOneBankTwo = Banco(nome = "OneDigi", numero = 7)
    println(digiOneBankTwo.info())
}