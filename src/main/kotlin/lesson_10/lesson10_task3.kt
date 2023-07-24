package lesson_10

fun main() {
    println("Введите длину генерируемого пароля в поле ниже:")
    val passwordLength = readln().toInt()

    val userPassword = generatePassword(passwordLength)

    println("\nПароль:\n$userPassword")
}

fun generatePassword(len: Int): String {
    val numbers = '0'..'9'
    val specSymbols = (32..47).map { it.toChar() }

    val password = StringBuilder()

    for (i in 0 until len) {
        if (i % 2 == 0) password.append(specSymbols.random())
        else password.append(numbers.random())
    }

    return password.toString()
}