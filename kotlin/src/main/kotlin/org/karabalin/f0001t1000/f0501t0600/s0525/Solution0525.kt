package org.karabalin.f0001t1000.f0501t0600.s0525

class Solution {
    fun findMaxLength(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        var maxLength = 0
        var prefixSum = 0

        map[0] = -1

        for (i in nums.indices) {
            prefixSum += if (nums[i] == 0) -1 else 1

            if (map.containsKey(prefixSum)) {
                maxLength = maxOf(maxLength, i - map[prefixSum]!!)
            } else {
                map[prefixSum] = i
            }
        }

        return maxLength
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(0, 0, 1, 0, 0, 1, 1)
    println(solution.findMaxLength(nums))
}
