package lesson_1

// Add leading zeros:
// https://www.fandroid.info/6-osnovy-kotlin-osnovy-tekstovogo-vvoda-vyvoda/2/
// https://www.tldevtech.com/add-leading-zeros-to-a-number-in-kotlin/

fun main() {
    val allSeconds = 6480

    val hours = allSeconds / 3600
    val minutes = allSeconds / 60 - 60 * hours
    val seconds = allSeconds % 60

    val time = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(time)
}