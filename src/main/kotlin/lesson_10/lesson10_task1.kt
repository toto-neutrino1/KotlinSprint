package lesson_10

fun main() {
    val userRoll = rollDice()
    val compRoll = rollDice()

    println("Компьютер выбросил: ${compRoll.joinToString()}")
    println("Пользователь выбросил: ${userRoll.joinToString()}\n")

    println(
        if (compRoll.sum() > userRoll.sum()) "Победила машина"
        else if (compRoll.sum() == userRoll.sum()) "Победила дружба"
        else "Победило человечество"
    )
}

fun rollDice() = List(2) { (1..6).random() }