package lesson_2

import java.util.Locale
import kotlin.math.pow

fun main() {
    val initialSum = 70_000
    val interestRate = 16.7
    val years = 20

    val _finalSum = initialSum * (1 + interestRate / 100).pow(years)
    val finalSum = "%.3f".format(locale = Locale.US, _finalSum)

    println(finalSum)
}