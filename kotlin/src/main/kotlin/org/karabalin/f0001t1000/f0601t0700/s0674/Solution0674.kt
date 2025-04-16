package org.karabalin.f0001t1000.f0601t0700.s0674

class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var result = 0
        var l = 0
        var r = 1
        var len = 0

        while (r < nums.size) {
            if (nums[r - 1] < nums[r]) {
                r++
                len++
            } else {
                l++
                r = l + 1
                result = maxOf(result, len + 1)
                len = 0
            }
        }

        result = maxOf(result, len + 1)
        return result
    }
}

fun main() {
    val solution = Solution()
    println(solution.findLengthOfLCIS(intArrayOf(1, 3, 5, 4, 7)))
    println(solution.findLengthOfLCIS(intArrayOf(2, 2, 2, 2, 2)))
}
