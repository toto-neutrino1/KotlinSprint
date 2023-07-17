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
    val str1 = "Неверно. Осталось ${numOfAttempts - 1}"
    val str2 = when (numOfAttempts - 1) {
        in 2..4 -> "попытки"
        0 -> "попыток"
        else -> "попытка"
    }

    println("$str1 $str2\n")
}