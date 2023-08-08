package lesson_18

import java.util.*
import kotlin.math.pow

fun main() {
    val rectangularBox = RectangularBox(id = 1, length = 1.0, width = 2.0, height = 3.0)
    val cubicBox = CubicBox(id = 2, length = 2.5)

    printAreaOfAllBoxes(listOf(rectangularBox, cubicBox))
}

fun printAreaOfAllBoxes(boxes: List<Box>) = boxes.forEach { it.printSurfaceArea() }

abstract class Box(val id: Int) {
    abstract fun printSurfaceArea()
}

class RectangularBox(
    id: Int,
    val length: Double,
    val width: Double,
    val height: Double
) : Box(id) {
    override fun printSurfaceArea() {
        val area = "%.2f".format(locale = Locale.US,2 * (length * (width + height) + width * height))
        println("$id. Прямоугольная коробка площадью $area")
    }
}

class CubicBox(
    id: Int,
    val length: Double,
) : Box(id) {
    override fun printSurfaceArea() {
        val area = "%.2f".format(locale = Locale.US,6 * length.pow(2))
        println("$id. Кубическая коробка площадью $area")
    }
}