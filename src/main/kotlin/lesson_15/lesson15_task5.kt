package lesson_15

fun main() {
    val car = Car()
    car.move()
    car.transportPassengers()

    val freightCar = FreightCar()
    freightCar.move()
    freightCar.transportGoods()
    freightCar.transportPassengers()
}

class FreightCar(
    override val numOfPassengers: Int = 1,
    override val name: String = "грузовой",
    val numOfGoods: Int = 2
) : AnyCar(), TransportationOfGoods {

    override fun transportGoods() {
        super.transportGoods()
        println(": $numOfGoods тонн")
    }
}

class Car(
    override val numOfPassengers: Int = 3,
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