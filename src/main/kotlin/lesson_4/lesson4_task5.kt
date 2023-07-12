package lesson_4

const val MIN_FOOD_BOXES = 50
const val MIN_CREW_MEMBERS = 55
const val MAX_CREW_MEMBERS = 70

fun main() {
    val isDamaged = readln().toBoolean()
    val numOfCrewMembers = readln().toInt()
    val numOfFoodBoxes = readln().toInt()
    val isGoodWeather = readln().toBoolean()

    printCanShipSail(isDamaged, numOfCrewMembers, numOfFoodBoxes, isGoodWeather)
}

fun printCanShipSail(
    isDamaged: Boolean,
    numOfCrewMembers: Int,
    numOfFoodBoxes: Int,
    isGoodWeather: Boolean,
) {

    var canShipSail = false

    if (numOfFoodBoxes > MIN_FOOD_BOXES) {
        if ((!isDamaged && numOfCrewMembers in MIN_CREW_MEMBERS..MAX_CREW_MEMBERS) ||
            (numOfCrewMembers == MAX_CREW_MEMBERS && isGoodWeather)
        ) {
            canShipSail = true
        }
    }

    println("Корабль может плыть? $canShipSail")
}