package org.karabalin.s0169

class Solution {
    fun majorityElement(nums: IntArray): Int {
        val n = nums.size / 2
        val map = mutableMapOf<Int, Int>()

        for (num in nums) {
            val count = map.getOrDefault(num, 0) + 1
            if (count > n) {
                return num
            }
            map[num] = count
        }

        return -1
    }
}

fun main() {
    val solution = Solution()
    println(solution.majorityElement(intArrayOf(3, 2, 3)))
    println(solution.majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
}

