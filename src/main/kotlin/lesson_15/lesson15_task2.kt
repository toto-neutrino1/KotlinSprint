package lesson_15

fun main() {
    val tempMessage =
        TemperatureMessage("Температура днём: 25 С \nТемпература ночью: 10 C")
    tempMessage.connectToServer()
    tempMessage.sendMessage()

    val precipitationMessage =
        PrecipitationMessage("Сумма осадков за февраль в Москве составила 44 мм")
    precipitationMessage.connectToServer()
    precipitationMessage.sendMessage()
}

class TemperatureMessage(override val message: String) : Message() {
    override fun sendMessage() =
        println("Отправили на сервер информацию о температуре: \n$message\n")
}

class PrecipitationMessage(override val message: String) : Message() {
    override fun sendMessage() =
        println("Отправили на сервер информацию о количестве осадков: \n$message\n")
}

abstract class Message {
    abstract val message: String
    fun connectToServer() = println("Подключаемся к серверу")
    //abstract fun sendData(data: String)
    abstract fun sendMessage()
}