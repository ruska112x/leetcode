package org.karabalin.f0001t1000.f0000t0100.s0070

class Solution {
    fun climbStairs(n: Int): Int {
        if (n == 1) return 1
        var n1 = 1
        var n2 = 2

        for (i in 3..n) {
            val tmp = n1
            n1 = n2
            n2 += tmp
        }

        return n2
    }
}

fun main() {
    val solution = Solution()
    println(solution.climbStairs(44))
}
