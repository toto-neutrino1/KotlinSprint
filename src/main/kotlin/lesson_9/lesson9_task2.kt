package lesson_9

fun main() {
    val ingredients = mutableListOf("соль", "сахар", "мука")
    println("В рецепте есть базовые ингредиенты:")
    ingredients.forEach { println(it) }
    println()

    println("Желаете добавить еще?")
    val answer = readln()

    if (answer.equals("да", ignoreCase = true)) {
        println("\nКакой ингредиент вы хотите добавить?")
        ingredients.add(readln())
        println("\nТеперь в рецепте есть следующие ингредиенты:")
        ingredients.forEach { println(it) }
    }
}