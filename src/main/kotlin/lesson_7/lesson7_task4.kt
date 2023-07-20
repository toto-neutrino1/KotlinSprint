package lesson_7

fun main() {
    println("Введите сколько секунд нужно засечь:")
    val timer = readln().toInt()
    println()

    for (leftTime in timer downTo 1) {
        println("Осталось секунд: $leftTime")
        Thread.sleep(1000)
    }
    println("\nВремя вышло")
}