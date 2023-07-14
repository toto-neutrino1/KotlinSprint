package lesson_5

import java.util.*

const val AGE_OF_MAJORITY = 18
fun main() {

    println("Введите ваш год рождения:")
    val yearOfBirth = readln().toInt()

    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    val userAge = currentYear - yearOfBirth

    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
}