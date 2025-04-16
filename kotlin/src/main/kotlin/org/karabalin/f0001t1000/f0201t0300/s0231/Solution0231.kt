package org.karabalin.f0001t1000.f0201t0300.s0231

class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        if (n <= 0) return false
        return (n and (n - 1)) == 0
    }
}

fun main() {
    val solution = Solution()
    println(solution.isPowerOfTwo(16))
    println(solution.isPowerOfTwo(18))
    println(solution.isPowerOfTwo(1))
    println(solution.isPowerOfTwo(0))
    println(solution.isPowerOfTwo(-2))
}
