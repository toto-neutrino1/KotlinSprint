package lesson_9

fun main() {
    val ingredients = listOf("соль", "сахар", "шоколад", "мука", "яйцо")
    println("В рецепте есть следующие ингредиенты:")
    ingredients.forEach { println(it) }
}