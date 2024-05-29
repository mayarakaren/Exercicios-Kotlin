//Construa um programa que leia o número de horas trabalhadas diárias (NH) de um funcionário por um
// período de 30 dias (ele trabalhou todos os 30 dias) e apresente o salário bruto recebido por ele nesse período,
// sabendo que o valor do salário é R$ 10,00/hora trabalhada.

fun main(){

    var totalhoras = 0.0
    val valhora = 10.00
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
    val salarioBruto = totalhoras * valhora
    println("O salário bruto recebido em $dias dias foi de R$ ${"%.2f".format(salarioBruto)}.")
}
