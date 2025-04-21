package org.karabalin.s2145

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun numberOfArrays(differences: IntArray, lower: Int, upper: Int): Int {
        var x = 0
        var y = 0
        var cur = 0
        for (d in differences) {
            cur += d
            x = min(x, cur)
            y = max(y, cur)
            if (y - x > upper - lower) {
                return 0
            }
        }
        return (upper - lower) - (y - x) + 1
    }
}

fun main() {
    val solution = Solution()
    println(solution.numberOfArrays(intArrayOf(3, -4, 5, 1, -2), -4, 5))
    println(solution.numberOfArrays(intArrayOf(-40), -46, 53))
    println(
        solution.numberOfArrays(
            intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
            -2,
            2
        )
    )
}
