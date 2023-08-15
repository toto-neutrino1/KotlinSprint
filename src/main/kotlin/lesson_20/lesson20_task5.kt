package lesson_20

fun main() {
    val robot1 = Robot(name = "R2D2", isModifierOn = true)
    val robot2 = Robot(name = "Bender")

    robot1.say()
    robot1.say()

    robot2.say()
    robot2.say()
}

class Robot(
    val name: String,
    var isModifierOn: Boolean = false
) {
    private val phrases = listOf(
        "водку с мартини: взболтать, но не смешивать",
        "да пребудет с тобой Сила",
        "чем больше сила, тем больше ответственность",
        "ты не можешь ударить человека в очках",
        "я - Бэтмен")

    private val modifier = { initialPhrase: String ->
        initialPhrase.split(" ").joinToString(separator = " ") { word: String -> word.reversed() } }

    fun say() = if (isModifierOn) println("$name: ${setModifier(modifier)}\n") else println("$name: ${phrases.random()}\n")

    private fun setModifier(modifier: (String) -> String) = modifier(phrases.random())
}