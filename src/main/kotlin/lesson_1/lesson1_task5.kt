package lesson_1

fun main() {
    val allSeconds = 6480

    val minutes = if (allSeconds / 60 > 9) {
        (allSeconds / 60).toString()
    } else {
        "0" + (allSeconds / 60).toString()
    }

    val seconds = if (allSeconds % 60 > 9) {
        (allSeconds % 60).toString()
    } else {
        "0" + (allSeconds % 60).toString()
    }

    println("$minutes:$seconds")
}