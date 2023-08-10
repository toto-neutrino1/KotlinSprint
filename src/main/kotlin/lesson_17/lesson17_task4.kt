package lesson_17

fun main() {
    val parcel = Package(id = 1, location = "Москва")
    parcel.printPackageInfo()
    parcel.location = "Санкт-Петербург"
    parcel.printPackageInfo()
    parcel.location = "Екатеринбург"
    parcel.printPackageInfo()
}

class Package(
    val id: Int,
    location: String
) {
    private var numOfMovements: Int = 0

    var location: String = location
        set(value) {
            if (location != value) {
                field = value
                numOfMovements++
            }
        }

    fun printPackageInfo() = println("Местоположение посылки: $location \nКоличество перемещений: $numOfMovements\n")
}