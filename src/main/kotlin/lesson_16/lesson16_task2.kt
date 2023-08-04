package lesson_16

import java.util.*
import kotlin.math.pow

private const val PI = 3.14

fun main() {
    val circle = Circle(2.22)
    println("Длина окружности: ${circle.getCircumference()}")
    println("Площадь круга: ${circle.getCircleArea()}")
}

class Circle(private val radius: Double) {
    fun getCircumference() = "%.2f".format(locale = Locale.US, 2 * PI * radius)
    fun getCircleArea() = "%.2f".format(locale = Locale.US, PI * radius.pow(2))
}