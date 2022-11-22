package lec01

class House(
    var address: String,
    var livingRoom: LivingRoom
) {
    inner class LivingRoom(
        private var area: Double
    ){
        val address: String
            get() = this@House.address
    }
}