package lesson_11

fun main() {
    val forum1 = Forum()
    forum1.createNewUser(userLogin = "first", userPassword = "qwerty", userEmail = "1st@gmail.com")
    forum1.createNewUser(userLogin = "second", userPassword = "qwerty1", userEmail = "2nd@gmail.com")

    forum1.createNewMessage(authorId = 1, message = "Здравствуйте!")
    forum1.createNewMessage(authorId = 2, message = "Приветствую!")
    forum1.createNewMessage(authorId = 2, message = "Какие дальнейшие планы?")
    forum1.createNewMessage(authorId = 1, message = "Учимся, изучаем Kotlin, переходим к Android")
    forum1.createNewUser(userLogin = "first", userPassword = "", userEmail = "")

    forum1.printThread()
}

class Forum(
    private val users: MutableList<User> = mutableListOf(),
    private val messages: MutableList<String> = mutableListOf(),
) {

    private val logins = mutableListOf<String>()

    fun createNewUser(userLogin: String, userPassword: String, userEmail: String) {

        if (userLogin in logins) println("Логин $userLogin уже существует.\n")

        else {
            val newUser = User(
                id = users.size + 1,
                login = userLogin,
                password = userPassword,
                email = userEmail
            )

            users.add(newUser)
            logins.add(userLogin)
        }
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (authorId in 1..logins.size) messages.add("${logins[authorId - 1]}: $message")
        else println("Такого ID нет в системе")
    }

    fun printThread() = println(messages.joinToString(separator = "\n"))
}

class User(
    val id: Int,
    val login: String,
    private var password: String,
    private val email: String,
    private var bio: String = "",
) {
    fun printUserData() = println("User$id \nlogin: $login; psw: $password; email: $email \n$bio\n\n")

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

    fun sendLetter(message: String) = println("Здравствуйте, $login! Вам пришло сообщение: \n$message")
}