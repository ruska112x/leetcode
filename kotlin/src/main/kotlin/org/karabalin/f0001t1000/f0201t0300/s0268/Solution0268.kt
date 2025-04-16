package org.karabalin.f0001t1000.f0201t0300.s0268

class Solution {
    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        val expectedSum = n * (n + 1) / 2
        val actualSum = nums.sum()
        return expectedSum - actualSum
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)
    println(solution.missingNumber(nums))
}
