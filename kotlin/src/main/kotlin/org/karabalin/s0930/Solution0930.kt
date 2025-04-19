package org.karabalin.s0930

class Solution {
    fun numSubarraysWithSum(nums: IntArray, goal: Int): Int {
        var result = 0
        var sum = 0
        val freq = mutableMapOf<Int, Int>()

        for (n in nums) {
            sum += n

            if (sum == goal) {
                result++
            }

            result += freq.getOrDefault(sum - goal, 0)
            freq[sum] = freq.getOrDefault(sum, 0) + 1
        }

        return result
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(1, 0, 1, 0, 1)
    val goal = 2
    println(solution.numSubarraysWithSum(nums, goal))
}
