//4. Escreva uma classe que contenha um método chamado drawSquare que exibe um quadrado
//sólido de asteriscos no vídeo cujo lado é especificado por um parâmetro side. Por exemplo, se
//
//side for igual a 4, o método exibe:
//****
//****
//****
//****

class Desenho{
    fun drawSquare(side: Int){
        for(i in 1 ..side){
            for(j in 1 ..side){
                print("*")
            }
            println()
        }
    }
}

fun main() {
    val draw = Desenho()
    val side = 6
    draw.drawSquare(side)
}

