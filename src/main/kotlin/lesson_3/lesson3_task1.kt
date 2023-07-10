package lesson_3

fun main() {
    val name = "Джон"
    var greeting = greeting(name, "день")
    println(greeting)

    greeting = greeting(name, "вечер")
    println(greeting)
}

fun greeting(name: String, timesOfDay: String) = "Добрый $timesOfDay, $name!"