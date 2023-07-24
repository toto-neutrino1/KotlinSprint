package lesson_11

fun main() {
    val room1 = Room(
        cover = "Мяч",
        name = "Спорт",
        members = listOf(
            Member("@user1"),
            Member("@user2", "разговаривает"),
            Member("@user3", "пользователь заглушен"),
            Member("@user4"),
        )
    )

    room1.printRoomInfo()
    room1.members[0].longClick()

    val room2 = Room(
        cover = "Ноутбук",
        name = "IT",
        members = listOf(
            Member("@user5"),
            Member("@user6"),
            Member("@user7"),
        )
    )
    room2.printRoomInfo()
    room2.members[1].sayStatus()
    room2.members[2].muteUser()
    room2.printRoomInfo()
    room2.members[1].turnOffMicrophone()
    room2.printRoomInfo()
}

private class Room(
    val cover: String,
    val name: String,
    val members: List<Member>,
) {
    fun printRoomInfo() {
        println("Room \"$name\" info: \ncover = $cover")
        for (member in members) {
            member.printMemberData()
        }
        println()
    }
}

private class Member(
    val nickName: String,
    private var status: String = "микрофон выключен"
) {

    fun longClick() = println("$nickName\n")
    fun printMemberData() = println("$nickName - $status")

    fun sayStatus() {
        status = "разговаривает"
    }


    fun turnOffMicrophone() {
        status = "микрофон выключен"
    }


    fun muteUser() {
        status = "пользователь заглушен"
    }
}