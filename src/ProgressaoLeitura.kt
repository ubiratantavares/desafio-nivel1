    fun main() {
    // lendo o nome do livro
    print("Digite o nome do livro: ")
    val nomeDoLivro = readln()

    // lendo o número total de páginas
    print("Digite o número total de páginas: ")
    val totalPaginas = readln().toInt()

    // lendo o total de páginas lidas
    print("Digite o número de páginas lidas: ")
    val paginasLidas = readln().toInt()

    // calculando a progressão de leitura em porcentagem
    val porcentagem = (paginasLidas.toDouble() / totalPaginas) * 100

    // exibindo o nome do livro e a progressão em porcentagem
    println("Livro: $nomeDoLivro")

    println("Progressão de leitura: %.2f%%".format(porcentagem))

}
