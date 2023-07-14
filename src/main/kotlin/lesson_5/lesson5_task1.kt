package lesson_5

import kotlin.random.Random

fun main() {
    val num1 = Random.nextInt(0, 100)
    val num2 = Random.nextInt(0, 100)

    println("Чему равно $num1 + $num2? \nВаш ответ:")
    val userNum = readln().toInt()

    println(if (userNum == (num1 + num2)) "Добро пожаловать!" else "Доступ запрещен.")
}