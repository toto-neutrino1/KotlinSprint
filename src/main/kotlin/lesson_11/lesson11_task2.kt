package lesson_11

fun main() {
    val user1 = User(id = 1, login = "John", password = "qwerty", email = "John@gmail.com")
    user1.printUserData()
    user1.fillUserInformation()
    user1.changePassword()
    user1.printUserData()
    user1.sendLetter("Добрый день, ${user1.login}! Помогите пожалуйста решить задачу:...")
}

private class User(
    private val id: Int,
    val login: String,
    private var password: String,
    private val email: String,
    private var bio: String = "",
) {
    fun printUserData() {
        println("User$id \nlogin: $login; psw: $password; email: $email \n$bio")
        println()
    }

    fun fillUserInformation() {
        println("Введите информацию о себе: \nСколько вам лет?")
        val age = readln()

        println("\nВаш город:")
        val city = readln()

        println("\nМесто работы / учёбы:")
        val work = readln()

        println("\nВаш любимый вид спорта:")
        val favoriteSport = readln()

        bio = "Возраст: $age \nГород: $city \nМесто работы / учёбы: $work \nЛюбимый спорт: $favoriteSport"
    }

    fun changePassword() {
        println("\nВведите старый пароль:")
        var userInput = readln()

        while (userInput != password) {
            println("Пароль неверный. \n\nВведите старый пароль:")
            userInput = readln()
        }

        println("\nВведите новый пароль:")
        userInput = readln()
        while (userInput == password) {
            println("Пароли совпадают. \n\nВведите новый пароль:")
            userInput = readln()
        }
        password = userInput
        println("Пароль изменён")
        println()
    }

    fun sendLetter(message: String) {
        println("Здравствуйте, $login! Вам пришло сообщение: \n$message")
    }
}