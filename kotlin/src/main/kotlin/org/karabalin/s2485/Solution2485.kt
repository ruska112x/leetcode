package org.karabalin.s2485

class Solution {
    fun pivotInteger(n: Int): Int {
        for (i in 1..n) {
            val prefixSum = (1 + i) * i / 2
            val suffixSum = (i + n) * (n - i + 1) / 2
            if (prefixSum == suffixSum) {
                return i
            }
        }
        return -1
    }
}

fun main() {
    val solution = Solution()
    println(solution.pivotInteger(8))
    println(solution.pivotInteger(1))
    println(solution.pivotInteger(4))
}
