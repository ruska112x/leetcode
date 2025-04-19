package org.karabalin.s0905

class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var start = 0
        var end = nums.lastIndex

        while (start < end) {
            if (nums[start] % 2 != 0 && nums[end] % 2 == 0) {
                val temp = nums[start]
                nums[start] = nums[end]
                nums[end] = temp
                start++
                end--
            } else if (nums[start] % 2 == 0 && nums[end] % 2 == 0) {
                start++
            } else {
                end--
            }
        }

        return nums
    }
}

fun main() {
    val solution = Solution()
    val result = solution.sortArrayByParity(intArrayOf(3, 1, 2, 4))
    println(result.joinToString())
}
