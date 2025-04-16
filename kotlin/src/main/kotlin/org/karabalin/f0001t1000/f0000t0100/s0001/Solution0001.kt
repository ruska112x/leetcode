package org.karabalin.f0001t1000.f0000t0100.s0001

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        var result = intArrayOf()
        for (i in nums.indices) {
            val x = nums[i]
            val remainder = target - x
            val remainderIndex = map[remainder]
            if (remainderIndex == null) {
                map[x] = i
            } else {
                result = intArrayOf(remainderIndex, i)
                break
            }
        }
        return result
    }
}

fun main() {
    val s = Solution()
    println(s.twoSum(intArrayOf(2, 7, 11, 15), 9).contentEquals(intArrayOf(0, 1)))
    println(s.twoSum(intArrayOf(3, 2, 4), 6).contentEquals(intArrayOf(1, 2)))
}
