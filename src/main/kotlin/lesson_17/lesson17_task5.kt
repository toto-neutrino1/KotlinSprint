package lesson_17

fun main() {
    val user = User(login = "user1", password = "qwerty")
    println("Логин: ${user.login}, пароль: ${user.password}\n")
    user.login = "user1"
    user.login = "user2"
    user.password = "12345"
}

class User(
    login: String,
    password: String
) {
    var login: String = login
        set(value) {
            if (field != value) {
                field = value
                println("Логин изменён. Новый логин: $field\n")
            } else println("Новый и старый логин не могут совпадать. Логин: $field\n")
        }

    var password: String = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}