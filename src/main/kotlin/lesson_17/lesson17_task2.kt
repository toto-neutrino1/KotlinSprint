package lesson_17

fun main() {
    val ship = Ship(name = "Титаник", averageSpeed = 23, homePort = "Ливерпуль" )
    println("Корабль \"${ship.name}\" \nсредняя скорость: ${ship.averageSpeed} \nпорт приписки: ${ship.homePort}\n")
    ship.name = "Millennium Falcon"
}

class Ship(
    name: String,
    val averageSpeed: Int,
    val homePort: String
) {
    var name: String = name
        set(value) {
            println("Имя корабля изменять нельзя!")
        }
}