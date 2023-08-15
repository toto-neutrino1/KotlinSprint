package lesson_20

fun main() {
    val strings = List(10) { "Строка ${it + 1}" }
    val lambdas = strings.map { { println("Нажат элемент $it") } }

    for (i in 1..lambdas.size step 2) {
        lambdas[i]()
    }
}