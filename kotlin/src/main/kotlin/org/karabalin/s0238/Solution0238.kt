package org.karabalin.s0238

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val prefix = IntArray(n) { 1 }
        val suffix = IntArray(n) { 1 }
        val result = IntArray(n)

        for (i in 1 until n) {
            prefix[i] = prefix[i - 1] * nums[i - 1]
        }

        for (i in n - 2 downTo 0) {
            suffix[i] = suffix[i + 1] * nums[i + 1]
        }

        for (i in 0 until n) {
            result[i] = prefix[i] * suffix[i]
        }

        return result
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(1, 2, 3, 4)
    println(solution.productExceptSelf(nums).joinToString())
}
