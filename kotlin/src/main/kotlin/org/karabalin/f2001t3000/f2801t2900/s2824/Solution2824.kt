package org.karabalin.f2001t3000.f2801t2900.s2824

class Solution {
    fun countPairs(nums: List<Int>, target: Int): Int {
        var count = 0
        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] < target) {
                    ++count
                }
            }
        }
        return count
    }
}

fun main() {
    val solution = Solution()
    println(solution.countPairs(listOf(-6, 2, 5, -2, -7, -1, 3), -2))
}
