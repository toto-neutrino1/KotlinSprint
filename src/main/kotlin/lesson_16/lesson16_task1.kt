package lesson_16

fun main() {
    val dice = Dice()
    dice.printDiceNumber()
}

class Dice {
    private val number = (1..6).random()
    fun printDiceNumber() = println("На кубике выпало число $number")
}