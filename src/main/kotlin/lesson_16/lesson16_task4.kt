package lesson_16

fun main() {
    val order = Order(1)
    order.sendRequestToManager("Обрабатывается")
    order.sendRequestToManager("В пути")
    order.sendRequestToManager("Доставлен")
}

class Order(
    private val id: Int,
    private var status: String = "Обрабатывается"
) {
    private fun changeStatus(newStatus: String) {
        println("Статус \"$status\" был изменен на статус \"$newStatus\"\n")
        status = newStatus
    }

    fun sendRequestToManager(newStatus: String) {
        if (newStatus != status) changeStatus(newStatus)
        else println("Статус \"$status\" уже был установлен ранее\n")
    }
}