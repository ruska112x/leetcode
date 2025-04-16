package org.karabalin.f0001t1000.f0000t0100.s0026

import java.util.*

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val set = TreeSet<Int>()
        for (e in nums) {
            set.add(e)
        }
        for (i in 0 until set.size) {
            nums[i] = set.elementAt(i)
        }
        return set.size
    }
}

fun main() {
    val s = Solution()
    println(s.removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
}
