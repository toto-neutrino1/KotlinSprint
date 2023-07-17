package lesson_6

fun main() {
    println("Введите сколько секунд нужно засечь:")
    val seconds = readln().toInt()
    Thread.sleep(1000L * seconds)
    println("\nПрошло $seconds секунд")
}