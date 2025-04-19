package org.karabalin.s0877

class Solution {
    fun stoneGame(piles: IntArray): Boolean {
        piles.sort()
        var a = 0
        var b = 0

        var i = 0
        while (i < piles.size - 1) {
            b += piles[i++]
            a += piles[i++]
        }

        return a > b
    }
}

fun main() {
    val solution = Solution()
    println(solution.stoneGame(intArrayOf(5, 3, 4, 5)))
}
