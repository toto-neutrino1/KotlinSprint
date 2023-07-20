package lesson_7

fun main() {
    println("Введите целое число:")
    val userNum = readln().toInt()
    val evenNumbers = if (userNum >= 0) 0..userNum step 2 else 0 downTo userNum step 2

    println()
    for (num in evenNumbers) println(num)
}