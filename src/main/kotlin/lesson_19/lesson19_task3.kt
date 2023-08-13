package lesson_19

fun main() {
    val spaceship = Spaceship()
    spaceship.takeOff()
    spaceship.toLand()
}

class Spaceship {
    fun takeOff() {
        println("Нужна дополнительная информация для метода takeOff()\n")
    }

    fun toLand() {
        TODO()
    }

    fun shootOffFromAsteroid() {}
}