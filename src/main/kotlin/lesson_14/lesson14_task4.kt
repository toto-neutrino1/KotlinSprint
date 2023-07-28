package lesson_14

fun main() {
    val planet = Planet(name = "Марс", isHabitable = true, hasWater = true, isSuitableForLanding = true)
    val satellite1 = Satellite("Фобос", planet)
    val satellite2 = Satellite("Деймос", planet)

    planet.printPlanetInfo()
    satellite1.printPlanetInfo()
    satellite2.printPlanetInfo()
}

class Satellite(
    val satelliteName: String,
    planet: Planet
) : Planet(planet.name) {

    override fun printPlanetInfo() {
        println("\nSatellite of $name: \nname: $satelliteName")
    }
}
open class Planet(
    name: String,
    val isHabitable: Boolean = false,
    val hasAtmosphere: Boolean = false,
    val hasWater: Boolean = false,
    val isSuitableForLanding: Boolean = false
) : HeavenlyBody(name, true, "spherical") {

    open fun printPlanetInfo() =
        println("Planet: $name \nis habitable: $isHabitable \nhas atmosphere: $hasAtmosphere" +
                "\nhas water: $hasWater \nis suitable for landing: $isSuitableForLanding")
}

open class HeavenlyBody(
    val name: String,
    val hasRotationAxis: Boolean = false,
    val bodyShape: String = "any"
)