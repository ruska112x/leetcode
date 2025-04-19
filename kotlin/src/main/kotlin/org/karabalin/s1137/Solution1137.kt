package org.karabalin.s1137

class Solution {
    fun tribonacci(n: Int): Int {
        if (n == 0) return 0
        if (n == 1 || n == 2) return 1

        var t0 = 0
        var t1 = 1
        var t2 = 1

        for (i in 3..n) {
            val tmp = t0 + t1 + t2
            t0 = t1
            t1 = t2
            t2 = tmp
        }

        return t2
    }
}

fun main() {
    val solution = Solution()
    println(solution.tribonacci(25))
}
