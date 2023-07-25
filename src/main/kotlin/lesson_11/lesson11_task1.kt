package lesson_11

fun main() {
    val user1 = UserData(id = 1, login = "first", password = "qwerty1", email = "first@gmail.com")
    user1.printUserData()

    val user2 = UserData(id = 2, login = "second", password = "qwerty2", email = "second@gmail.com")
    user2.printUserData()
}

class UserData(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {
    fun printUserData() {
        println("User$id \nlogin: $login; psw: $password; email: $email")
        println()
    }
}