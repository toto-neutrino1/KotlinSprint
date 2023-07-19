package lesson_7

fun main() {
    val alphabet = 'a'..'z'
    val numbers = 0..9

    val elem1 = alphabet.random()
    val elem2 = numbers.random()
    val elem3 = alphabet.random()
    val elem4 = numbers.random()
    val elem5 = alphabet.random()
    val elem6 = numbers.random()

    val password = "$elem1$elem2$elem3$elem4$elem5$elem6"

    println(password)

}