package lec01

class House(
    var address: String,
    var livingRoom: LivingRoom = LivingRoom(10.0)
) {
    class LivingRoom(
        private var area: Double
    )
}