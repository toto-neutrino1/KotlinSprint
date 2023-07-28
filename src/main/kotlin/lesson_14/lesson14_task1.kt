package lesson_14

fun main() {
    val standardShip = StandardShip1("Стандартный", 200, 100)
    standardShip.printVelocity()
    standardShip.printCapacity()
    standardShip.printIceBreakAbility()

    val cargoShip = StandardShip1("Грузовой", 100, 1000)
    cargoShip.printVelocity()
    cargoShip.printCapacity()
    cargoShip.printIceBreakAbility()

    val icebreakerShip = StandardShip1("Ледокол", 120, 50, true)
    icebreakerShip.printVelocity()
    icebreakerShip.printCapacity()
    icebreakerShip.printIceBreakAbility()
}

class StandardShip1(
    val name: String,
    val velocity: Int,
    val loadCapacity: Int,
    val canBreakIce: Boolean = false
) {
    fun printVelocity() = println("Корабль $name движется со скоростью $velocity у.е. / час")

    fun printCapacity() = println("Корабль $name вмещает $loadCapacity тонн")

    fun printIceBreakAbility() = println("Корабль $name может колоть лёд: $canBreakIce\n")
}