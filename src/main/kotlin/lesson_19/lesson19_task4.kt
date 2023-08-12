package lesson_19

fun main() {
    val tank = Tank(Cartridge.GREEN)
    tank.fire()

    tank.arm(Cartridge.RED)
    tank.fire()
}

class Tank(private var cartridge: Cartridge) {
    fun arm(newCartridge: Cartridge) {
        cartridge = newCartridge
    }

    fun fire() =
        println("Произведён выстрел патроном ${cartridge.name}, нанесён урон: ${cartridge.impactForce}\n")
}

enum class Cartridge(val impactForce: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}