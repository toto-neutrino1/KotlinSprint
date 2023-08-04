package lesson_16

fun main() {
    val order = Order(1)
    order.changeStatus("В пути")
    order.changeStatus("Доставлен")
}

class Order(
    private val id: Int,
    private var status: String = "Обрабатывается"
) {
    fun changeStatus(newStatus: String) {
        println("Статус \"$status\" был изменен на статус \"$newStatus\"\n")
        status = newStatus
    }
}