package org.karabalin.s2769

class Solution {
    fun theMaximumAchievableX(num: Int, t: Int): Int {
        return (2 * t) + num
    }
}

fun main() {
    val solution = Solution()
    println(solution.theMaximumAchievableX(4, 1))
}
