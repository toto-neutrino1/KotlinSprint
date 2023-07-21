package lesson_8

fun main() {
    val ingredients = arrayOf("соль", "сахар", "мука", "яйцо", "ванилин", "яблоко")

    println("Какой ингредиент вы хотите найти? \nВведите название в единственном числе:")
    val userIngredient = readln().lowercase()

    for (elem in ingredients) {
        if (userIngredient == elem) {
            println("\nИнгредиент \"$elem\" в рецепте есть")
            return
        }
    }

    println("\nТакого ингредиента в рецепте нет")
}