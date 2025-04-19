package org.karabalin.s0643

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0.0
        for (i in 0 until k) {
            sum += nums[i]
        }

        var max = sum
        for (i in k until nums.size) {
            sum += nums[i] - nums[i - k]
            max = maxOf(max, sum)
        }

        return max / k
    }
}

fun main() {
    val solution = Solution()
    println(solution.findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4))
}
