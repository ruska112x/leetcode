package org.karabalin.s1603

class ParkingSystem(big: Int, medium: Int, small: Int) {
    private val intArrayOf = intArrayOf(big, medium, small)

    fun addCar(carType: Int): Boolean {
        if (intArrayOf[carType - 1] > 0) {
            intArrayOf[carType - 1] -= 1
            return true
        }
        return false
    }
}

fun main() {
    val parkingSystem = ParkingSystem(1, 1, 0)
    println(parkingSystem.addCar(1))
    println(parkingSystem.addCar(2))
    println(parkingSystem.addCar(3))
    println(parkingSystem.addCar(1))
}
