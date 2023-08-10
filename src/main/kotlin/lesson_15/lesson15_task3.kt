package lesson_15

fun main() {
    val admins = MutableList(3) { Admin(it + 1, "admin${it + 1}") }
    val users = MutableList(5) { User(it + 4, "user${it + 1}") }

    val forum = Forum()
    forum.users.addAll(admins)
    forum.users.addAll(users)

    forum.users[2].writeMessage("Добро пожаловать на форум!", forum.messages)
    forum.users[5].writeMessage("Привет!", forum.messages)
    forum.users[4].writeMessage("Какие планы?", forum.messages)
    forum.users[1].writeMessage("Учимся!", forum.messages)
    forum.readMessages()

    forum.deleteMessage(userId = 2, messageId = 3)
    forum.readMessages()
    forum.printUsers()

    forum.deleteUser(userId = 5, deletingUserId = 6)
    forum.deleteUser(userId = 3, deletingUserId = 6)
    forum.printUsers()
    forum.printAdmins()
}

class Forum(
    val users: MutableList<BasicUser> = mutableListOf(),
    val messages: MutableList<String> = mutableListOf()
) {
    fun readMessages() = users[0].readMessages(messages)

    fun deleteMessage(userId: Int, messageId: Int): Boolean {
        return if (userId in 1..users.size &&
            messageId in 1..messages.size &&
            users[userId - 1] is Admin) {
            messages.removeAt(messageId - 1)
            true
        } else {
            println("Попытка удаления сообщения с id = $messageId пользователем с id = $userId неудачна!\n")
            false
        }
    }

    fun deleteUser(userId: Int, deletingUserId: Int): Boolean {
        return if (userId in 1..users.size &&
            deletingUserId in 1..users.size &&
            users[userId - 1] is Admin) {
            users.removeIf { it.id == deletingUserId }
            true
        } else {
            println("Попытка удаления пользователя с id = $deletingUserId пользователем с id = $userId неудачна!\n")
            false
        }
    }

    fun printUsers() = println("\nUsers: ${users.filterIsInstance<User>().joinToString(separator = ", ") { it.user }}")

    fun printAdmins() = println("Admins: ${users.filterIsInstance<Admin>().joinToString(separator = ", ") { it.admin }}")
}

class Admin(
    id: Int,
    val admin: String
) : BasicUser(id) {
    override fun writeMessage(message: String, messages: MutableList<String>) {
        messages.add("$admin: $message")
    }
}

class User(
    id: Int,
    val user: String
) : BasicUser(id) {
    override fun writeMessage(message: String, messages: MutableList<String>) {
        messages.add("$user: $message")
    }
}

abstract class BasicUser(val id: Int) {
    fun readMessages(messages: MutableList<String>) = println(messages.joinToString(separator = "\n", postfix = "\n"))
    abstract fun writeMessage(message: String, messages: MutableList<String>)
}