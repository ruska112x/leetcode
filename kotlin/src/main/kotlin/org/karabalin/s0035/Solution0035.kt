package org.karabalin.s0035

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for (i in nums.indices) {
            if (i == 0 && target <= nums[i]) {
                return i
            }
            if (i == nums.lastIndex) {
                return nums.size
            }
            if (nums[i] < target && target <= nums[i + 1]) {
                return i + 1
            }
        }
        return nums.size
    }
}

fun main() {
    val solution = Solution()
    println(solution.searchInsert(intArrayOf(1, 3, 5, 6), 5))
    println(solution.searchInsert(intArrayOf(1, 3, 5, 6), 7))
    println(solution.searchInsert(intArrayOf(1, 3, 5, 6), 0))
}
