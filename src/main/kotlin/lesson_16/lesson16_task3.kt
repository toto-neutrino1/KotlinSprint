package lesson_16

fun main() {
    val user = User(login = "user1", password = "qwerty")
    user.checkPassword("12345")
    user.checkPassword("qwerty")
}

class User(
    val login: String,
    private val password: String
) {
    fun checkPassword(inputPassword: String) = println(
        if (inputPassword == password) "Пароль введен верно\n"
        else "Пароль неверный\n"
    )
}