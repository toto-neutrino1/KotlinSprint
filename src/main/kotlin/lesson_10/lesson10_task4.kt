package lesson_10

fun main() {
   var userWins = 0
    if (isUserWins()) userWins++

    println("Хотите бросить кости еще раз? Введите Да или Нет:")
    var userAnswer = readln()

    while (userAnswer.equals("да", ignoreCase = true)) {
        if (isUserWins()) userWins++

        println("\nХотите бросить кости еще раз? Введите Да или Нет:")
        userAnswer = readln()
    }

    println("\nПользователь выиграл $userWins партий")
}

private fun rollDice() = List(2) { (1..6).random() }

fun isUserWins(): Boolean {
    val userRoll = rollDice()
    val compRoll = rollDice()

    println("Компьютер выбросил: ${compRoll.joinToString()}")
    println("Пользователь выбросил: ${userRoll.joinToString()}\n")

    return compRoll.sum() < userRoll.sum()
}