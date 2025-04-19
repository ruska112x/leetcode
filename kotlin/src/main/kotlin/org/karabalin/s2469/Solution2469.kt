package org.karabalin.s2469

class Solution {
    fun convertTemperature(celsius: Double): DoubleArray {
        return doubleArrayOf((celsius + 273.15), (celsius * 1.8 + 32))
    }
}

fun main() {
    val solution = Solution()
    println(solution.convertTemperature(36.50).contentEquals(doubleArrayOf(309.65000, 97.70000)))
}
