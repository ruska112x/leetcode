package org.karabalin.f0001t1000.f0701t0800.s0709

class Solution {
    fun toLowerCase(s: String): String {
        return s.lowercase()
    }
}

fun main() {
    val solution = Solution()
    println(solution.toLowerCase("Hello") == "hello")
}
