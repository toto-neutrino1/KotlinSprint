package lesson_2

fun main() {
    val buffPercent = 20
    val crystalOre = 7
    val ironOre = 11

    println("Бонусы")
    println("Кристаллическая руда: ${crystalOre * buffPercent / 100}")
    println("Железная руда: ${ironOre * buffPercent / 100}")
}