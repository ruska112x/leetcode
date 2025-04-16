package org.karabalin.f0001t1000.f0201t0300.s0217

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = mutableSetOf<Int>()
        for (num in nums) {
            if (num in seen) {
                return true
            }
            seen.add(num)
        }
        return false
    }
}

fun main() {
    val solution = Solution()
    println(solution.containsDuplicate(intArrayOf(1, 2, 3, 1)))
    println(solution.containsDuplicate(intArrayOf(1, 2, 3, 4)))
}
