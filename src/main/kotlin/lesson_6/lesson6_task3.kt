package lesson_6

fun main() {
    println("Введите сколько секунд нужно засечь:")
    var timer = readln().toInt()
    println()

    while (timer > 0) {
        println("Осталось секунд: ${timer--}")
        Thread.sleep(1000)
    }
    println("\nВремя вышло")
}