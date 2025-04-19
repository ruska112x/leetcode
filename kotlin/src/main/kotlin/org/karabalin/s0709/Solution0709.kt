package org.karabalin.s0709

class Solution {
    fun toLowerCase(s: String): String {
        return s.lowercase()
    }
}

fun main() {
    val solution = Solution()
    println(solution.toLowerCase("Hello") == "hello")
}
