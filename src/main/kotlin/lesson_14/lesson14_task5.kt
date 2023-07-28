package lesson_14

import java.util.*
import kotlin.math.PI
import kotlin.math.pow

const val TRIANGLE = "Треугольник"
const val RECTANGLE = "Прямоугольник"
const val CIRCLE = "Круг"

fun main() {
    val circle1 = Circle("Красный", 1.0)
    val circle2 = Circle("Черный", 0.35)

    val rectangle1 = Rectangle("Красный", 2.2, 2.2)
    val rectangle2 = Rectangle("Зеленый", 33.1, 3.0)

    val triangle1 = Triangle("Черный", 1.0, 2.0, 1.5)
    val triangle2 = Triangle("Зеленый", 10.1, 8.2, 5.98)

    val figures = listOf(circle1, circle2, rectangle1, rectangle2, triangle1, triangle2)
    val redPerimeters = "%.2f".format(locale = Locale.US, sumPerimetersOfRedFigures(figures))
    val redSquares = "%.2f".format(locale = Locale.US, sumSquaresOfRedFigures(figures))

    println("Периметр всех красных фигур: $redPerimeters \nПлощадь всех красных фигур: $redSquares")
}

class Circle(
    color: String,
    val radius: Double
) : Figure(color, CIRCLE) {

    override fun getSquare(): Double = PI * radius.pow(2)

    override fun getPerimeter(): Double = 2 * PI * radius
}

class Rectangle(
    color: String,
    val length: Double,
    val width: Double
) : Figure(color, RECTANGLE) {

    override fun getSquare(): Double = length * width

    override fun getPerimeter(): Double = 2 * (length + width)
}

class Triangle(
    color: String,
    val len1: Double,
    val len2: Double,
    val len3: Double,
) : Figure(color, TRIANGLE) {

    override fun getSquare(): Double {
        val p = getPerimeter() / 2
        return (p * (p - len1) * (p - len2) * (p - len3)).pow(0.5)
    }

    override fun getPerimeter(): Double = len1 + len2 + len3
}

abstract class Figure(val color: String, val name: String) {

    abstract fun getSquare(): Double

    abstract fun getPerimeter(): Double
}

fun sumPerimetersOfRedFigures(figures: List<Figure>) =
    figures.filter { it.color.lowercase() == "красный" }.sumOf { it.getPerimeter() }

fun sumSquaresOfRedFigures(figures: List<Figure>) =
    figures.filter { it.color.lowercase() == "красный" }.sumOf { it.getSquare() }