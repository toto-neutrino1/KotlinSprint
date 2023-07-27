package lesson_12

fun main() {
    val weather1 = WeatherTracker2(40, 28, atmPressure = 0.98)
    val weather2 = WeatherTracker2(30, 20, true, 1.1)
    val weather3 = WeatherTracker2(5, -5, atmPressure = 1.0)
}

class WeatherTracker2(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var wasItRaining: Boolean = false,
    var atmPressure: Double,
) {

    init {
        println("Day temp.: $dayTemperature C \nNight temp.: $nightTemperature C")
        println("Was it raining: $wasItRaining \nAtm. pressure: $atmPressure atm.\n")
    }
}