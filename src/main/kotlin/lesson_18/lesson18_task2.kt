package lesson_18

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()

    printNumbersAtAllDices(listOf(dice4, dice6, dice8))
}

fun printNumbersAtAllDices(dices: List<Dice>) = dices.forEach { it.printNumber() }

open class Dice(
    val numOfFaces: Int
) {
    fun printNumber() = println("На кубике $numOfFaces выпало число: ${(1..numOfFaces).random()}\n")
}

class Dice4() : Dice(numOfFaces = 4)

class Dice6() : Dice(numOfFaces = 6)

class Dice8() : Dice(numOfFaces = 8)