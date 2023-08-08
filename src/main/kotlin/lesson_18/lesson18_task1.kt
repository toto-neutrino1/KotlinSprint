package lesson_18

fun main() {
    val order1 = OrderWithOneGood(id = 1, good = "хлеб")
    val order2 = OrderWithManyGoods(id = 2, goods = listOf("кефир", "молоко", "соль", "сахар"))

    printAllOrdersInfo(listOf(order1, order2))
}

fun printAllOrdersInfo(orders: List<Order>) = orders.forEach { it.printOrderInfo() }

open class Order(
    val id: Int
) {
    open fun printOrderInfo() {}
}

class OrderWithOneGood(
    id: Int,
    val good: String
) : Order(id) {
    override fun printOrderInfo() = println("$id. Заказан товар: $good\n")
}

class OrderWithManyGoods(
    id: Int,
    val goods: List<String>
) : Order(id) {
    override fun printOrderInfo() = println("$id. Заказаны товары: ${goods.joinToString()}\n")
}