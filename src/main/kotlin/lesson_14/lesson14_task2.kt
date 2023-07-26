package lesson_14

fun main() {
    val standardShip = StandardShip2("Стандартный", 200, 100)
    standardShip.printVelocity()
    standardShip.printCapacity()

    val cargoShip = CargoShip("Грузовой", 100, 1000, 10)
    cargoShip.printVelocity()
    cargoShip.printCapacity()
    cargoShip.printSpecInfo()

    val icebreakerShip = IceBreakerShip("Ледокол", 120, 50, "black", "SpaceX")
    icebreakerShip.printVelocity()
    icebreakerShip.printCapacity()
    icebreakerShip.printIceBreakAbility()
    icebreakerShip.printSpecInfo()
}

class IceBreakerShip(
    name: String,
    velocity: Int,
    loadCapacity: Int,
    val color: String = "white",
    val manufacturer: String,
) : StandardShip2(name, velocity, loadCapacity, true) {
    fun printIceBreakAbility() = println("Корабль $name может колоть лёд: $canBreakIce")

    fun printSpecInfo() = println("Корабль $name color: \"$color\", manufacturer: \"$manufacturer\"")
}

class CargoShip(
    name: String,
    velocity: Int,
    loadCapacity: Int,
    val numOfLoaders: Int = 1,
) : StandardShip2(name, velocity, loadCapacity) {
    fun printSpecInfo() = println("Корабль $name number of loaders: $numOfLoaders шт.")
}

open class StandardShip2(
    val name: String,
    val velocity: Int,
    val loadCapacity: Int,
    val canBreakIce: Boolean = false
) {
    fun printVelocity() = println("\nКорабль $name движется со скоростью $velocity у.е. / час")

    fun printCapacity() = println("Корабль $name вмещает $loadCapacity тонн")
}