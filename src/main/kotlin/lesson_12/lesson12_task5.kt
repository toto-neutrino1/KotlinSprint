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

    var sumDayTemp = 0
    var sumNightTemp = 0
    var sumPressure = 0.0
    var numOfRainingDays = 0

    weathers.forEach {
        sumDayTemp += it.dayTemperature
        sumNightTemp += it.nightTemperature
        sumPressure += it.atmPressure

        if (it.wasItRaining) numOfRainingDays++
    }

    printMeans(sumDayTemp, sumNightTemp, sumPressure, numOfRainingDays, weathers.size)


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

fun printMeans(
    sumDayTemp: Int,
    sumNightTemp: Int,
    sumPressure: Double,
    numOfRainingDays: Int,
    numOfDays: Int
) {
    val meanDayTemp = sumDayTemp / numOfDays.toDouble()
    val meanNightTemp = sumNightTemp / numOfDays.toDouble()
    val meanPressure = "%.3f".format(locale = Locale.US,sumPressure / numOfDays)

    println("\nMean values over $numOfDays days")
    println("Mean day temp = $meanDayTemp C \nMean night temp = $meanNightTemp C")
    println("Mean atm. pressure = $meanPressure atm.")
    println("Num of raining days = $numOfRainingDays")
}