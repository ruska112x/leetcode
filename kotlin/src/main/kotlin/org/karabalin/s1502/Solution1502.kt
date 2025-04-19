package org.karabalin.s1502

import kotlin.math.abs

class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        if (arr.size <= 2) return true
        arr.sort()
        val d = abs(arr[0] - arr[1])
        for (i in 1 until (arr.size) - 1) {
            if (abs(arr[i] - arr[i + 1]) != d) return false
        }
        return true
    }
}

fun main() {
    val solution = Solution()
    println(solution.canMakeArithmeticProgression(intArrayOf(3, 5, 1)))
    println(solution.canMakeArithmeticProgression(intArrayOf(1, 2, 4)))
}
