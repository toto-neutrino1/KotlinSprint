package lesson_20

fun main() {
    val player = Player(name = "Raiden", currentHealth = 50)
    player.printPlayerInfo()
    player.takeHealingPotion()
    player.printPlayerInfo()
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = 100
) {
    val takeHealingPotion = { currentHealth = maxHealth }
    val printPlayerInfo = { println("Игрок $name, уровень здоровья: $currentHealth") }
}