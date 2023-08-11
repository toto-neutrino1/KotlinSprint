package lesson_20

fun main() {
    val player3 = Player3(name = "John")
    player3.checkKey()

    player3.hasKey = true
    player3.checkKey()
}

class Player3(
    val name: String,
    var hasKey: Boolean = false
) {
    val checkKey = { if (hasKey) println("Игрок $name открыл дверь") else println("Дверь заперта") }
}