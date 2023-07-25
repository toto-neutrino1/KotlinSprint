package lesson_12

fun main() {
    val weather1 = WeatherTracker()
    weather1.dayTemperature = 40
    weather1.nightTemperature = 28
    weather1.wasItRaining = false
    weather1.atmPressure = 0.98

    val weather2 = WeatherTracker()
    weather2.dayTemperature = 30
    weather2.nightTemperature = 20
    weather2.wasItRaining = true
    weather2.atmPressure = 1.1

    weather1.printWeatherData()
    weather2.printWeatherData()
}


class WeatherTracker {
    var dayTemperature = 25
    var nightTemperature = 15
    var wasItRaining = false
    var atmPressure = 1.0

    fun printWeatherData() {
        println("Day temp.: $dayTemperature C \nNight temp.: $nightTemperature C")
        println("Was it raining: $wasItRaining \nAtm. pressure: $atmPressure atm.\n")
    }
}