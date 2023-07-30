package lesson_15

fun main() {
    val car = Car(numOfPassengers = 3)
    car.move()
    car.transportPassengers()

    val freightCar = FreightCar(numOfPassengers = 1, numOfGoods = 2)
    freightCar.move()
    freightCar.transportGoods()
    freightCar.transportPassengers()
}

class FreightCar(
    override val numOfPassengers: Int,
    override val name: String = "грузовой",
    val numOfGoods: Int
) : AnyCar(), TransportationOfGoods {

    override fun transportGoods() {
        super.transportGoods()
        println(": $numOfGoods тонн")
    }
}

class Car(
    override val numOfPassengers: Int,
    override val name: String = "легковой"
) : AnyCar()

abstract class AnyCar : CarMovement, TransportationOfPassengers {
    abstract val numOfPassengers: Int
    abstract val name: String

    override fun move() {
        super.move()
        println(name)
    }

    override fun transportPassengers() {
        super.transportPassengers()
        println(": 1 водитель и $numOfPassengers пассажиров. Итого перевезли: ${1 + numOfPassengers} чел.")
    }
}

interface CarMovement {
    fun move() = print("\nПередвигаем автомобиль ")
}

interface TransportationOfPassengers {
    fun transportPassengers() = print("Перевозим пассажиров")
}

interface TransportationOfGoods {
    fun transportGoods() = print("Перевозим грузы")
}