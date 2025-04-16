package org.karabalin.f0001t1000.f0301t0400.s0349

class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set1 = nums1.toSet()
        val set2 = nums2.toSet()
        return set1.intersect(set2).toIntArray()
    }
}

fun main() {
    val solution = Solution()
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)
    println(solution.intersection(nums1, nums2).joinToString())
}
