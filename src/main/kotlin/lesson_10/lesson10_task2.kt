package lesson_10

fun main() {
    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    println(
        if (checkUserData(login) && checkUserData(password)) "\nДобро пожаловать!"
        else "\nЛогин или пароль недостаточно длинные"
    )
}

fun checkUserData(userData: String) = userData.length >= 4