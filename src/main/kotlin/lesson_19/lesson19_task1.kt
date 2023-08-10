package lesson_19

fun main() {
    printAllFishes()
}

fun printAllFishes() = println("Вы можете добавить в аквариум рыб: \n${Fish.values().joinToString()}")

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}