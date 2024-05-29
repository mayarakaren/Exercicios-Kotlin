//5. Acrescente uma nova versão do método drawSquare à classe do exercício anterior que dese-
//nha um quadrado preenchido com o caractere dado pelo parâmetro fillCharacter. Portanto,
//
//se side for igual a 5 e fillCharacter for '#', o método deve exibir:
//#####
//#####
//#####
//#####
//#####
//Escreva um programa para testar as duas versões do método do método drawSquare.


class Desenho{
    fun drawSquare(side: Int) {
        for (i in 1..side) {
            for (j in 1..side) {
                print("*")
            }
            println()
        }
    }

    fun drawSquare(side: Int, fillCharacter: Char) {
        for (i in 1..side) {
            for (j in 1..side) {
                print(fillCharacter)
            }
            println()
        }
    }
}

fun main() {
    val draw = Desenho()
    val side = 6
    val fillCharacter = '#'

    println("Versão 1 - Quadrado com asteriscos:")
    draw.drawSquare(side)

    println("\nVersão 2 - Quadrado preenchido com '$fillCharacter':")
    draw.drawSquare(side, fillCharacter)
}
