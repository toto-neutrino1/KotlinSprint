package lesson_10

import java.lang.StringBuilder

fun main() {
    val userData = registration()
    authorization(userData)
}

fun registration(): List<String> {
    println("Придумайте и введите ваш логин в поле ниже:")
    var login = readln()

    while (!checkLogin(login)) {
        println("Логин должен быть не короче 4 символов.\n\nВведите ваш логин:")
        login = readln()
    }

    val password = generatePassword(length = 15)
    println("\nВаш пароль: \n$password")

    return listOf(login, password)
}

fun authorization(userData: List<String>) {
    println("\nВведите свои данные.\nВведите логин:")
    var login = readln()
    println("\nВведите пароль:")
    var password = readln()

    while ((login != userData[0]) || (password != userData[1])) {
        println("Неверные данные.\n\nВведите логин:")
        login = readln()
        println("\nВведите пароль:")
        password = readln()
    }

    var smsCode = generateSMSCode()
    println("\nСМС-код: \n$smsCode\n")

    println("Введите смс-код:")
    var userCode = readln().toInt()

    while (userCode != smsCode) {
        smsCode = generateSMSCode()
        println("Неверные данные. \n\nСМС-код: \n$smsCode\n")

        println("Введите смс-код:")
        userCode = readln().toInt()
    }
    println("\nАвторизация прошла успешно!")
}

fun checkLogin(login: String) = login.length >= 4

fun generatePassword(length: Int): String {
    val symbols = ('0'..'9') + ('a'..'z') + ('A'..'Z') + (32.toChar()..47.toChar())
    val password = StringBuilder()

    for (i in 1..length) {
        password.append(symbols.random())
    }

    return password.toString()
}

fun generateSMSCode() = (1000..9999).random()