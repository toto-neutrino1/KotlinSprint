package lesson_18

import kotlin.math.pow

fun main() {
    val screen = Screen()
    screen.draw(x = 1, y = 2, Point())
    screen.draw(x = 1.1f, y = 2, Circle(radius = 3.3))
    screen.draw(x = 1, y = 2.25f, Square(length = 3.3))
    screen.draw(x = 0.187f, y = 10.1f, Point())
}

class Screen {
    fun draw(x: Int, y: Int, figure: Figure) =
        println("Нарисовали объект \"${figure.name}\" площадью ${figure.getArea()} в позиции ($x; $y)\n")
    fun draw(x: Float, y: Int, figure: Figure) =
        println("Нарисовали объект \"${figure.name}\" площадью ${figure.getArea()} в позиции ($x; $y)\n")
    fun draw(x: Int, y: Float, figure: Figure) =
        println("Нарисовали объект \"${figure.name}\" площадью ${figure.getArea()} в позиции ($x; $y)\n")
    fun draw(x: Float, y: Float, figure: Figure) =
        println("Нарисовали объект \"${figure.name}\" площадью ${figure.getArea()} в позиции ($x; $y)\n")
}

open class Figure(val name: String) {
    open fun getArea() = "0.0001"
}

class Circle(val radius: Double) : Figure("круг") {
    override fun getArea() = "%.2f".format(3.14 * radius.pow(2))
}

class Square(val length: Double) : Figure("квадрат") {
    override fun getArea() = "%.2f".format(length.pow(2))
}

class Point : Figure("точка")