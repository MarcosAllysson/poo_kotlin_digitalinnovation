package one.digitalinnovation.digionebank

//Data class armazenam o estado do objeto e não modificá-lo mais - imutável.
data class Banco(
    val nome: String,
    val numero: Int,
) {
    fun info() = "Nome: $nome, Número: $numero"
}
