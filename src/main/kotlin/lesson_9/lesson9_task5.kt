package lesson_9

fun main() {
    println("Введите ниже 5 ингредиентов, каждый ингредиент нужно ввести с новой строки:")
    val ingredients = List(5) { readln() }.toSet().toList().sorted()
    println("\nВаши ингредиенты:")
    println((ingredients.joinToString(separator = ", ", postfix = ".")).replaceFirst(
        ingredients[0].first(), ingredients[0].first().uppercaseChar())
    )
}