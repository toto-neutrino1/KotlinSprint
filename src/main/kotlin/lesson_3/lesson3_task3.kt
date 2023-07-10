package lesson_3

fun main() {
    val num = 5
    val multiplicationTable = """
        $num * 1 = ${num * 1}
        $num * 2 = ${num * 2}
        $num * 3 = ${num * 3}
        $num * 4 = ${num * 4}
        $num * 5 = ${num * 5}
        $num * 6 = ${num * 6}
        $num * 7 = ${num * 7}
        $num * 8 = ${num * 8}
        $num * 9 = ${num * 9}
    """.trimIndent()

    println(multiplicationTable)
}