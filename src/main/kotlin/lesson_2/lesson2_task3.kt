package lesson_2

fun main() {
    val hourDeparture = 9
    val minDeparture = 39
    val travelTime = 457

    val _hourArriving = (hourDeparture + (travelTime / 60) + (minDeparture + travelTime % 60) / 60)
    val _minArriving = (minDeparture + travelTime % 60) % 60

    val hourArriving = _hourArriving.toString()
    val minArriving = if (_minArriving > 9) _minArriving.toString() else "0$_minArriving"

    println("$hourArriving:$minArriving")
}