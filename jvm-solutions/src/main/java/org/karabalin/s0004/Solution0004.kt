package org.karabalin.s0004

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var i = 0
        var j = 0
        var k = 0
        val s = nums1.size + nums2.size
        val arr = IntArray(s)
        while (i < nums1.size && j < nums2.size) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++]
            } else {
                arr[k++] = nums2[j++]
            }
        }
        while (i < nums1.size) {
            arr[k++] = nums1[i++]
        }
        while (j < nums2.size) {
            arr[k++] = nums2[j++]
        }
        return if (s % 2 == 0) {
            (arr[(s / 2) - 1] + arr[(s / 2)]) / 2.0
        } else {
            arr[(s / 2)].toDouble()
        }
    }
}

fun main() {
    val s = Solution()
    println(s.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)))
    println(s.findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4)))
}