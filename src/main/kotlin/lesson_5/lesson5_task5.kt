package lesson_5

import kotlin.random.Random

fun main() {

    val number1 = Random.nextInt(1, 101) // (1..100).random() - ещё один способ
    val number2 = Random.nextInt(1, 101)

    println("Угадайте 2 числа от 1 до 100\n")
    println("Введите, чему равно первое число в поле ниже:")
    val num1 = readln().toInt()

    println("Введите, чему равно второе число в поле ниже:")
    val num2 = readln().toInt()

    val areGuessedBothNumbers =
        (num1 == number1 && num2 == number2) || (num1 == number2 && num2 == number1)

    val isGuessedOneNumber =
        (num1 == number1 || num1 == number2) || (num2 == number1 || num2 == number2)

    println(
        if (areGuessedBothNumbers) "Поздравляем! Вы выиграли главный приз!"
        else if (isGuessedOneNumber) "Вы выиграли утешительный приз!"
        else "Неудача! Крутите барабан!"
    )

    println("\nДля победы нужно было ввести числа $number1 и $number2")
}