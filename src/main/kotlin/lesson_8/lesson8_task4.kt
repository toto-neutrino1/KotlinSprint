package lesson_8

fun main() {
    val ingredients = arrayOf("соль", "сахар", "мука", "яйцо", "ванилин", "яблоко")
    println(ingredients.joinToString(prefix = "Ингредиенты: ", separator = ", ", postfix = "\n"))

    println("Какой ингредиент вы хотите заменить? Введите название в поле ниже:")
    val oldIngredient = readln()

    if (oldIngredient !in ingredients) println("\nТакого ингредиента нет в списке")
    else {
        println("\nКакой ингредиент вы хотите добавить? Введите название:")
        val newIngredient = readln()
        ingredients[ingredients.indexOf(oldIngredient)] = newIngredient

        println(
            ingredients.joinToString(
                prefix = "\nГотово! Вы сохранили следующий список: ",
                separator = ", "
            )
        )
    }
}