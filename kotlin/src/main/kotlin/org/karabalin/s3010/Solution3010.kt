package org.karabalin.s3010

import java.util.Arrays

class Solution {
    fun minimumCost(nums: IntArray): Int {
        val n = nums.size
        val s = nums[0]
        Arrays.sort(nums, 1, n)
        return s +  nums[1] + nums[2]
    }
}

fun main() {
    val solution = Solution()
    println(solution.minimumCost(intArrayOf(1, 2, 3, 12)))
    println(solution.minimumCost(intArrayOf(10, 3, 1, 1)))
}
