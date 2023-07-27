package lesson_12

import java.util.*

fun main() {
    val weathers: MutableList<WeatherTracker5> = mutableListOf()
    val bools = listOf(false, true)

    var dayTemperature: Int

    for (i in 1..10) {
        dayTemperature = (-40..50).random()
        weathers.add(
            WeatherTracker5(
                dayTemperature = dayTemperature,
                nightTemperature = dayTemperature - (5..20).random(),
                wasItRaining = bools.random(),
                atmPressure = ((88..102).random()) / 100.0
            )
        )
    }

    printMeans(weathers)
}

class WeatherTracker5(
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

fun printMeans(weathers: MutableList<WeatherTracker5>) {
    val meanDayTemp = "%.2f".format(locale = Locale.US, weathers.map { it.dayTemperature }.average())
    val meanNightTemp = "%.2f".format(locale = Locale.US,weathers.map { it.nightTemperature }.average())
    val meanPressures = "%.3f".format(locale = Locale.US,weathers.map { it.atmPressure}.average())
    val numOfRainingDays = weathers.count { it.wasItRaining }

    println("\nMean values over ${weathers.size} days")
    println("Mean day temp = $meanDayTemp C \nMean night temp = $meanNightTemp C")
    println("Mean atm. pressure = $meanPressures atm.")
    println("Num of raining days = $numOfRainingDays")
}