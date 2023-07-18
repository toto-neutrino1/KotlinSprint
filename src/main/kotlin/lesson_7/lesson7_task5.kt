package lesson_7

fun main() {
    println("Пароль какой длины вы хотите сгенерировать? Введите число:")
    val passwordLen = readln().toInt()

    val password = generatePassword(passwordLen)
    println("\nПароль:\n$password")
}

fun generatePassword(passwordLen: Int): String {
    val digits = 0..9
    val lowerLetters = 'a'..'z'
    val upperLetters = 'A'..'Z'

    val password: MutableList<String> = mutableListOf()

    for (i in 1..passwordLen) {
        if ((1..2).random() == 1) password.add("${digits.random()}")
        else {
            if ((1..2).random() == 1) password.add("${lowerLetters.random()}")
            else password.add("${upperLetters.random()}")
        }
    }
    return password.joinToString(separator = "")
}