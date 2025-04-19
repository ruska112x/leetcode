package org.karabalin.f2001t3000.f2501t2600.s2563

class Solution {
    fun countFairPairs(nums: IntArray, lower: Int, upper: Int): Long {
        nums.sort()
        var count = 0L
        val n = nums.size

        for (i in 0 until n) {
            val left = lowerBound(nums, lower - nums[i], i + 1)
            val right = upperBound(nums, upper - nums[i], i + 1)
            count += (right - left)
        }

        return count
    }

    private fun lowerBound(nums: IntArray, target: Int, start: Int): Int {
        var left = start
        var right = nums.size
        while (left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] < target) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }

    private fun upperBound(nums: IntArray, target: Int, start: Int): Int {
        var left = start
        var right = nums.size
        while (left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] <= target) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }
}

fun main() {
    val solution = Solution()
    println(solution.countFairPairs(intArrayOf(0, 1, 7, 4, 4, 5), 3, 6))
    println(solution.countFairPairs(intArrayOf(1, 7, 9, 2, 5), 11, 11))
}
