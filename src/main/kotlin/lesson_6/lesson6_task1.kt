package lesson_6

fun main() {
    println("Регистрация")
    println("Какой у вас будет логин? Введите его в поле ниже:")
    val userLogin = readln()

    println("\nКакой у вас будет пароль:")
    val userPassword = readln()

    var isRightLogin = false
    var isRightPassword = false

    while (!isRightLogin || !isRightPassword) {
        println("\nВведите логин:")
        if (readln() != userLogin) println("Такого логина нет в системе")
        else {
            isRightLogin = true

            println("\nВведите ваш пароль:")
            if (readln() != userPassword) println("Пароль неверный")
            else {
                println("Авторизация прошла успешно")
                isRightPassword = true
            }
        }
    }
}