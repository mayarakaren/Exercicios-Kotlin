//A conversão de graus Fahrenheit para Celsius é obtida pela fórmula C=5/9(F-32).
// Construa um programa que calcule e apresente TODAS as temperaturas (em Celsius) correspondentes
// aquelas em Fahrenheit de 1 até 50, ou seja, para cada temperatura em Fahrenheit, variando de 1 até 50,
// calcular e apresentar uma temperatura em Celsius.
//OBS: A fórmula apresentada no enunciado é uma representação matemática e não o modo como deve ser
// escrita no seu programa.

fun main() {
    println("Fahrenheit   Celsius")

    // Loop de 1 a 50 para calcular e exibir as temperaturas correspondentes
    for (fahrenheit in 1..50) {
        val celsius = (5.0 / 9.0) * (fahrenheit - 32)
        println("$fahrenheit           ${"%.2f".format(celsius)}")
    }
}
