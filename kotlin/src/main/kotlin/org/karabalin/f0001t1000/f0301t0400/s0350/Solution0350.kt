package org.karabalin.f0001t1000.f0301t0400.s0350

class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val map1 = mutableMapOf<Int, Int>()
        val map2 = mutableMapOf<Int, Int>()

        for (i in nums1) {
            map1[i] = map1.getOrDefault(i, 0) + 1
        }

        for (j in nums2) {
            map2[j] = map2.getOrDefault(j, 0) + 1
        }

        val result = mutableListOf<Int>()
        for ((num, count1) in map1) {
            val count2 = map2.getOrDefault(num, 0)
            val minCount = minOf(count1, count2)
            repeat(minCount) {
                result.add(num)
            }
        }

        return result.toIntArray()
    }
}

fun main() {
    val solution = Solution()
    val nums1 = intArrayOf(4, 9, 5)
    val nums2 = intArrayOf(9, 4, 9, 8, 4)
    println(solution.intersect(nums1, nums2).joinToString())
}
