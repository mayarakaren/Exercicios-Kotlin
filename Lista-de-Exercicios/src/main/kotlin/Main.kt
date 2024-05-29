//Construa um programa que leia a quantidade (Q) e o preço (PR) de 45 produtos diferentes, comprados por uma empresa, e apresente o total gasto por ela.

fun main() {
    // Inicialize a variável para armazenar o total gasto
    var totalGasto = 0.0

    // Loop para ler os produtos e preços
    for (i in 1..45) {
        // Solicite a quantidade do produto i
        print("Digite a quantidade do produto $i: ")
        val quantidade = readLine()?.toIntOrNull()

        // Verifique se a quantidade é válida
        if (quantidade == null) {
            println("Quantidade inválida. Tente novamente.")
            continue // Volte para a próxima iteração do loop
        }

        // Solicite o preço do produto i
        print("Digite o preço do produto $i: ")
        val preco = readLine()?.toDoubleOrNull()

        // Verifique se o preço é válido
        if (preco == null) {
            println("Preço inválido. Tente novamente.")
            continue // Volte para a próxima iteração do loop
        }

        // Calcule o gasto com o produto i (quantidade * preço)
        val gastoProduto = quantidade * preco

        // Adicione o gasto com o produto i ao total gasto
        totalGasto += gastoProduto
    }

    // Exiba o total gasto pela empresa
    println("O total gasto pela empresa foi de R$ ${"%.2f".format(totalGasto)}")
}