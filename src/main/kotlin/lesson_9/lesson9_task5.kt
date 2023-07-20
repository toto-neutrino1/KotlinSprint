package lesson_9

fun main() {
    println("Введите ниже 5 ингредиентов, каждый ингредиент нужно ввести с новой строки:")
    val ingredients = MutableList(5) { readln() }.toSet().toMutableList()
    ingredients.sort()
    println("\nВаши ингредиенты:")
    println((ingredients.joinToString(separator = ", ", postfix = ".")).replaceFirst(
        ingredients[0].first(), ingredients[0].first().uppercaseChar())
    )
}