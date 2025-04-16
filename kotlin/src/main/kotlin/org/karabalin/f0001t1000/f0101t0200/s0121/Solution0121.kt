package org.karabalin.f0001t1000.f0101t0200.s0121

class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0

        var maxProfit = 0
        var buy = prices[0]

        for (i in 1 until prices.size) {
            if (prices[i] < buy) {
                buy = prices[i]
            } else {
                val profit = prices[i] - buy
                if (profit > maxProfit) {
                    maxProfit = profit
                }
            }
        }

        return maxProfit
    }
}

fun main() {
    val solution = Solution()
    println(solution.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
    println(solution.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
}
