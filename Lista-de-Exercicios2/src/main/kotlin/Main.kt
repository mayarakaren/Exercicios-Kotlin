//Construa um programa que leia o número de horas trabalhadas diárias (NH) de um funcionário por um
// período de 30 dias (ele trabalhou todos os 30 dias) e apresente o total de horas trabalhadas por ele nesse
// período.


fun main(){

    var totalhoras = 0.0
    val dias = 30

    for(i in 1..dias){
    print("Digite a quantidade de horas trabalhadas $i: ")
    val numhoras = readLine()?.toDoubleOrNull()
        if (numhoras != null) {
            totalhoras += numhoras
        } else {
            println("Valor inválido. Tente novamente.")
            return
        }
    }

    println("O total de horas trabalhadas em $dias dias foi de $totalhoras horas.")
}
