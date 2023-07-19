package lesson_6

fun main() {
    val guessedNumber = (1..9).random()
    var numOfAttempts = 5

    while (numOfAttempts > 0) {
        println("Введите число от 1 до 9 в поле ниже:")
        if (readln().toInt() == guessedNumber) {
            println("Это была великолепная игра!")
            return
        }
        else {
            printErrorMessage(numOfAttempts)
            numOfAttempts--
        }
    }

    println("Было загадано число: $guessedNumber")
}

fun printErrorMessage(numOfAttempts: Int) {
    var attempts = numOfAttempts
    attempts--
    val str1 = "Неверно. Осталось $attempts"
    val str2 = when (attempts) {
        in 2..4 -> "попытки"
        0 -> "попыток"
        else -> "попытка"
    }

    println("$str1 $str2\n")
}