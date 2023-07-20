package lesson_7

fun main() {
    val numbers = 1000..9999
    var code: Int
    var userInput: Int

    code = numbers.random()
    println("Ваш код авторизации: $code")

    println("Введите код авторизации:")
    userInput = readln().toInt()
    println()

    while (userInput != code) {
        code = numbers.random()
        println("Ваш код авторизации: $code")

        println("Введите код авторизации:")
        userInput = readln().toInt()
        println()
    }

    println("Добро пожаловать!")
}