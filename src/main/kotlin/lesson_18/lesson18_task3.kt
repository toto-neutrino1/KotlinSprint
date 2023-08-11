package lesson_18

fun main() {
    val fox = Fox()
    val dog = Dog()
    val cat = Cat()

    val animals = listOf(fox, dog, cat)
    printEatForAllAnimals(animals)
}

fun printEatForAllAnimals(animals: List<Animal>) = animals.forEach { it.eat() }

abstract class Animal(
    val name: String
) {
    fun play() = println("$name - играет")
    fun sleep() = println("$name - спит")
    abstract fun eat()
}

class Fox() : Animal(name = "лиса") {
    override fun eat() = println("$name - ест ягоды")
}

class Dog() : Animal(name = "собака") {
    override fun eat() = println("$name - ест кости")
}

class Cat() : Animal(name = "кошка") {
    override fun eat() = println("$name - ест рыбу")
}