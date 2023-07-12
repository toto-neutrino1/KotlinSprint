package lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val HUMIDITY = 20
const val BAD_SEASON = "зима"

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val humidity = 20
    val season = "зима"

    val areGoodConditions = (isSunny == IS_SUNNY) && (isAwningOpen == IS_AWNING_OPEN) &&
                            (humidity == HUMIDITY) && (season != BAD_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $areGoodConditions")
}