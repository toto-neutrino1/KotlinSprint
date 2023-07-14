package lesson_5

const val NUMBER_1 = 17
const val NUMBER_2 = 98

fun main() {
    println("Угадайте 2 числа от 1 до 100\n")
    println("Введите, чему равно первое число в поле ниже:")
    val num1 = readln().toInt()

    println("Введите, чему равно второе число в поле ниже:")
    val num2 = readln().toInt()

    val areGuessedBothNumbers =
        (num1 == NUMBER_1 && num2 == NUMBER_2) || (num1 == NUMBER_2 && num2 == NUMBER_1)

    val isGuessedOneNumber =
        (num1 == NUMBER_1 || num1 == NUMBER_2) || (num2 == NUMBER_1 || num2 == NUMBER_2)

    println(
        if (areGuessedBothNumbers) "Поздравляем! Вы выиграли главный приз!"
        else if (isGuessedOneNumber) "Вы выиграли утешительный приз!"
        else "Неудача! Крутите барабан!"
    )

    println("\nДля победы нужно было ввести числа $NUMBER_1 и $NUMBER_2")
}