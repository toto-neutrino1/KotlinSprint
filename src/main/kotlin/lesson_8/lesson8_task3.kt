package lesson_8

fun main() {
    val ingredients = arrayOf("соль", "сахар", "мука", "яйцо", "ванилин", "яблоко")

    println("Какой ингредиент вы хотите найти? \nВведите название в единственном числе:")
    val userIngredient = readln()

    println(
        if (userIngredient in ingredients) "\nИнгредиент \"$userIngredient\" в рецепте есть"
        else "\nТакого ингредиента в рецепте нет"
    )
}