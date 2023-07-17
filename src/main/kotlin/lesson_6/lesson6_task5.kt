package lesson_6

fun main() {

    var num1: Int
    var num2: Int
    var userNum: Int

    var numOfAttempts = 3

    while (numOfAttempts > 0) {
        num1 = (1..9).random()
        num2 = (1..9).random()

        println("Чему равно $num1 + $num2? \nВаш ответ:")
        userNum = readln().toInt()

        if (userNum == num1 + num2) {
            println("Добро пожаловать!")
            return
        }
        println()
        numOfAttempts--
    }

    println("Доступ запрещен")
}