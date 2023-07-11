package lesson_4

const val TABLES = 13
fun main() {
    val reservedToday = 13
    val reservedTomorrow = 9

    //printTableAvailability("сегодня", reservedToday)
    //printTableAvailability("завтра", reservedTomorrow)

    val reservationToday = "Доступность столиков на сегодня: ${reservedToday < TABLES}"
    val reservationTomorrow = "Доступность столиков на завтра: ${reservedTomorrow < TABLES}"
    println("$reservationToday \n$reservationTomorrow")
}

fun printTableAvailability(date: String, reservedTable: Int) {
    println("Доступность столиков на $date: ${reservedTable < TABLES}")
}