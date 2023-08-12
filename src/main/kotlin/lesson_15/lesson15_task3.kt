package lesson_15

fun main() {
    val forum = Forum()

    forum.addUser(userId = 3, userName = "User1", isAdmin = false)
    forum.addUser(userId = 4, userName = "User2", isAdmin = false)
    forum.addUser(userId = 1, userName = "Admin4", isAdmin = true)
    forum.addUser(userId = 2, userName = "User3", isAdmin = false)
    forum.addUser(userId = 5, userName = "User4", isAdmin = false)
    forum.printUsers()
    forum.printAdmins()

    forum.addMessage(userId = 1, message = "Добро пожаловать на форум!")
    forum.addMessage(userId = 4, message = "Привет!")
    forum.addMessage(userId = 6, message = "Какие планы?")
    forum.addMessage(userId = 3, message = "Учимся!")
    forum.readMessages()

    forum.deleteMessage(userId = 4, messageId = 1)
    forum.deleteMessage(userId = 2, messageId = 1)
    forum.readMessages()

    forum.deleteUser(userId = 7, deletingUserId = 1)
    forum.deleteUser(userId = 2, deletingUserId = 6)
    forum.printUsers()
    forum.printAdmins()
}

class Forum(
    private val users: MutableList<BasicUser> = MutableList(3) { Admin(it + 1, "admin${it + 1}") },
    private val messages: MutableList<Message> = mutableListOf()
) {
    private val allUserIds: List<Int>
        get() = users.map { it.id }

    private val allMessageIds: List<Int>
        get() = messages.map { it.id }

    fun addUser(userId: Int, userName: String, isAdmin: Boolean) {
        if (userId in allUserIds && users.find { it.id == userId } is Admin) {
            if (!isAdmin) users.add(User(id = allUserIds.max() + 1, user = userName))
            else users.add(Admin(id = allUserIds.max() + 1, admin = userName))
        } else println("Добавление пользователя \"$userName\" невозможно!\n")
    }

    fun addMessage(userId: Int, message: String) {
        if (userId in allUserIds) {
            val addingId = if (allMessageIds.isNotEmpty()) allMessageIds.max() + 1 else 1
            messages.add(Message(id = addingId, message = "${users.find { it.id == userId }!!.userType}: $message"))
        } else println("Добавление сообщения невозможно!")
    }

    fun readMessages() = println(messages.joinToString(separator = "\n", postfix = "\n") { it.message })

    fun deleteMessage(userId: Int, messageId: Int): Boolean {
        return if (userId in allUserIds &&
            messageId in allMessageIds &&
            users.find { it.id == userId } is Admin) {
            messages.removeIf { it.id == messageId }
            true
        } else {
            println("Попытка удаления сообщения с id = $messageId пользователем с id = $userId неудачна!\n")
            false
        }
    }

    fun deleteUser(userId: Int, deletingUserId: Int): Boolean {
        return if (
            userId in allUserIds &&
            deletingUserId in allUserIds &&
            users.find { it.id == userId } is Admin
            ) {
            users.removeIf { it.id == deletingUserId }
            true
        } else {
            println("Попытка удаления пользователя с id = $deletingUserId пользователем с id = $userId неудачна!\n")
            false
        }
    }

    fun printUsers() = println("\nUsers: ${users.filterIsInstance<User>().joinToString(separator = ", ") { it.userType }}\n")

    fun printAdmins() = println("Admins: ${users.filterIsInstance<Admin>().joinToString(separator = ", ") { it.userType }}\n")
}

class Message(val id: Int, val message: String)

class Admin(id: Int, admin: String) : BasicUser(id = id, userType = admin)

class User(id: Int, user: String) : BasicUser(id = id, userType = user)

abstract class BasicUser(val id: Int, val userType: String)