package lesson_20

fun main() {
    println(congratulation("John"))
}

val congratulation = { username: String -> "С наступающим Новым Годом, $username!" }