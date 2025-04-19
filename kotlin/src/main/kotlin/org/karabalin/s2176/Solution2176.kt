package org.karabalin.s2176

class Solution {
    fun countPairs(nums: IntArray, k: Int): Int {
        var count = 0
        for (i in 0 until nums.size - 1) {
            for (j in (i + 1) until nums.size) {
                if (nums[i] == nums[j] && ((i * j) % k == 0)) {
                    ++count
                }
            }
        }
        return count
    }
}

fun main() {
    val solution = Solution()
    println(solution.countPairs(intArrayOf(3, 1, 2, 2, 2, 1, 3), 2))
}
