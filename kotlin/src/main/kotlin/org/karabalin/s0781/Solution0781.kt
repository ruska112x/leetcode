package org.karabalin.s0781

import kotlin.math.ceil

class Solution {
    fun numRabbits(answers: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        for (i in answers) {
            val iInMap = map[i]
            if (iInMap == null) {
                map[i] = 1
            } else {
                map[i] = 1 + iInMap
            }
        }
        var count = 0
        map.forEach { k, v ->
            count += ceil(v / (k + 1).toDouble()).toInt() * (k + 1)
        }
        return count
    }
}

fun main() {
    val solution = Solution()
    println(solution.numRabbits(intArrayOf(1, 1, 2)))
    println(solution.numRabbits(intArrayOf(10, 10, 10)))
    println(solution.numRabbits(intArrayOf(1, 0, 1, 0, 0)))
    println(solution.numRabbits(intArrayOf(0, 0, 1, 1, 1)))
    println(solution.numRabbits(intArrayOf(2, 1, 2, 2, 2, 2, 2, 2, 1, 1)))
    println(solution.numRabbits(intArrayOf(0, 3, 2, 0, 3, 3, 4, 2, 4, 3, 2, 4, 4, 3, 0, 1, 3, 4, 4, 3)))
}
