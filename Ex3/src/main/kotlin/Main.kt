//3. Crie uma classe Casa com os seguintes atributos: cor (String), porta1 (Porta), porta2 (Porta) e
//porta3 (Porta). A classe deve possuir pelo menos um construtor, os métodos getters e setters
//que você julgar necessários, e os métodos: void pintar(String c), int quantasPortasEstaoAber-
//tas(). Crie uma casa e pinte-a. Defina as dimensões das portas da casa, abra e feche as mesmas
//como desejar. Utilize o método quantasPortasEstaoAbertas() para imprimir o número de portas
//abertas.


// porta.kt
class Porta(var aberta: Boolean) {
    constructor(): this(false)
    fun open() {
        aberta = true
    }
    fun close() {
        aberta = false
    }
}

class Casa(var color: String, var porta1: Porta, var porta2: Porta, var porta3: Porta) {
    constructor() : this("Branca", Porta(), Porta(), Porta())

    fun paint(cor: String) {
        println("A cor da casa antes de pintar é: $color") // Mostra a cor atual
        this.color = cor
        println("A cor da casa após pintar é: $cor") // Mostra a nova cor
    }

    fun portasAbertas(): Int {
        var count = 0

        if (porta1.aberta) {
            count++
        }
        if (porta2.aberta) {
            count++
        }
        if (porta3.aberta) {
            count++
        }
        return count
    }
}

fun main() {

    val porta1 = Porta()
    val porta2 = Porta()
    val porta3 = Porta()
    val casa = Casa("Branca", porta1, porta2, porta3)

    porta1.open()
    porta2.open()
    porta3.close()

    casa.paint("Rosa")

    val portasAbertas = casa.portasAbertas()
    println("Número de portas abertas: $portasAbertas")

}