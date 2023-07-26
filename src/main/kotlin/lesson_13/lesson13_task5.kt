package lesson_13

import java.lang.NumberFormatException


fun main() {
    println("Введите номер телефона:")
    try {
        val number = readln().toLong()
        println("\nВы ввели номер: $number")
    } catch (e: NumberFormatException) {
        println("\nНомер может содержать только цифры")
    }
}