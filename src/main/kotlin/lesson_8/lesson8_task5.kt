package lesson_8

fun main() {
    println("Сколько ингредиентов планируете добавить? \nВведите число в поле ниже:")
    val numOfIngredients = readln().toInt()

    println("\nВведите название каждого ингредиента с новой строки:")

    val ingredients = Array(numOfIngredients) { readln() }

    println(ingredients.joinToString(prefix = "\nИнгредиенты: ", separator = ", "))
}