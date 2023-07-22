package lesson_9

fun main() {
    println("Введите в поле ниже через запятую 5 ингредиентов:")
    val ingredients = readln().split(",").sorted()
    println("\nВаши ингредиенты:")
    ingredients.forEach { println(it) }
}