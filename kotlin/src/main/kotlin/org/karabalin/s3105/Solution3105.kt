package org.karabalin.s3105

import kotlin.math.max

class Solution {
    fun longestMonotonicSubarray(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var maxLen = 1
        var inc = 1
        var dec = 1
        for (i in 1 until nums.size) {
            if (nums[i] > nums[i - 1]) {
                inc++
                dec = 1
            } else if (nums[i] < nums[i - 1]) {
                dec++
                inc = 1
            } else {
                inc = 1
                dec = 1
            }

            maxLen = max(maxLen, max(inc, dec))
        }
        return maxLen
    }
}

fun main() {
    val solution = Solution()
    println(solution.longestMonotonicSubarray(intArrayOf(1, 4, 3, 3, 2)))
    println(solution.longestMonotonicSubarray(intArrayOf(3, 3, 3, 3)))
    println(solution.longestMonotonicSubarray(intArrayOf(3, 2, 1)))
}
