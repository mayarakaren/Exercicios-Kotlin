//2. Crie uma classe Porta com os seguintes atributos: aberta (boolean), cor (String), altura (float)
//e largura (float). A classe deve possuir pelo menos um construtor e os métodos: void abrir(),
//void fechar(), void pintar(String c), boolean estaAberta(), void setAltura(float a) e void
//setLargura(float l). Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas
//dimensões e use o método estaAberta() para verificar se ela está aberta.

// porta.kt
class Porta(var aberta: Boolean, var cor: String, var altura: Float, var largura: Float) {
    constructor(): this(false, "Branco", 2.0f, 1.0f)
    fun open() {
        aberta = true
    }
    fun close() {
        aberta = false
    }
    fun paint(cor: String) {
        this.cor = cor
    }
    fun aberta(): Boolean {
        return aberta
    }
    fun altura(altura: Float) {
        this.altura = altura
    }
    fun largura(largura: Float) {
        this.largura = largura
    }
}
fun main() {
    val porta = Porta()
    println("A porta está aberta? ${porta.aberta()}") //false
    porta.open()
    println("A porta está aberta? ${porta.aberta()}") //True
    porta.close()
    println("A porta está realmente aberta? ${porta.aberta()}") //True
    porta.aberta()
    println("Qual a cor da porta? ${porta.cor}") // branco
    porta.paint("branco")
    println("Qual a altura da porta? ${porta.altura}") // 3.0
    porta.altura(2.0f)
    println("Qual a largura da porta? ${porta.largura}") // 1.5
    porta.largura(1.0f)

}