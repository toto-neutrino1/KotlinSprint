package lesson_7

fun main() {
    println("Пароль какой длины вы хотите сгенерировать? Введите число:")
    val passwordLen = readln().toInt()

    val password = generatePassword(passwordLen)
    println("\nПароль:\n$password")
}

fun generatePassword(passwordLen: Int): String {
    val symbols = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val password = StringBuilder()

    for (i in 1..passwordLen) {
        password.append("${symbols.random()}")
    }
    return password.toString()
}