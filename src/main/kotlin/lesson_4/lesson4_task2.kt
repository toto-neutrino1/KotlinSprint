package lesson_4

fun main() {
    val minMass = 35
    val maxMass = 100
    val maxVolume = 100

    //printIsAverage(averageMass, averageVolume, mass = 42, volume = 120)

    printIsAverage(minMass, maxMass, maxVolume, mass = 20, volume = 80)
    printIsAverage(minMass, maxMass, maxVolume, mass = 50, volume = 100)
}

// Using Int
fun printIsAverage(
    minMass: Int,
    maxMass: Int,
    maxVolume:Int,
    mass: Int,
    volume: Int,
) {
    val averageOrNot = (mass >= minMass && mass <= maxMass) && (volume < maxVolume) // скобки нужны для разделения m/V
    println("Груз с весом $mass кг и объемом $volume л соответствует категории 'Average': $averageOrNot")
}

// Using IntRange
fun printIsAverage(
    averageMass: IntRange,
    averageVolume: IntRange,
    mass: Int,
    volume: Int,
) {

    val averageOrNot = mass in averageMass && volume in averageVolume
    println("Груз с весом $mass кг и объемом $volume л соответствует категории 'Average': $averageOrNot")
}