package org.karabalin.s1920

class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        for (i in nums.indices) {
            result[i] = nums[nums[i]]
        }
        return result
    }
}

fun main() {
    val solution = Solution()
    val result = solution.buildArray(intArrayOf(0, 2, 1, 5, 3, 4))
    println(result.joinToString())
}
