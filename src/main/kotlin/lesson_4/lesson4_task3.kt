package lesson_4

const val GOOD_WEATHER = "солнечная"
const val AWNING = "открыт"
const val HUMIDITY = 20
const val BAD_SEASON = "зима"
fun main() {
    val isGoodWeather = "солнечная" == GOOD_WEATHER // по условию тип boolean должен быть
    val isGoodAwning = "открыт" == AWNING // по условию тип boolean должен быть
    val humidity = 20
    val season = "зима"

    val areGoodConditions = isGoodWeather && isGoodAwning && (humidity == HUMIDITY) && (season != BAD_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $areGoodConditions")
}