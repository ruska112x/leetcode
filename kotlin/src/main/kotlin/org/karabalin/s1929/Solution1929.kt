package org.karabalin.s1929

class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n * 2)
        for (i in nums.indices) {
            result[i] = nums[i]
            result[i + n] = nums[i]
        }
        return result
    }
}

fun main() {
    val solution = Solution()
    val result = solution.getConcatenation(intArrayOf(1, 2, 1))
    println(result.joinToString())
}
