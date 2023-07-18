package lesson_7

fun main() {
    val numbers = 1000..9999
    var code: Int
    var userInput: Int

    var counter = 0

    while (counter < 100) {
        code = numbers.random()
        println("Ваш код авторизации: $code")

        println("Введите код авторизации:")
        userInput = readln().toInt()
        println()

        if (userInput == code) {
            println("Добро пожаловать!")
            return
        }

        counter++
    }
}