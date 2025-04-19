package org.karabalin.s0078

class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val n = nums.size
        val result = mutableListOf<MutableList<Int>>()

        for (i in 0 until (1 shl n)) {
            val subset = mutableListOf<Int>()
            for (j in 0 until n) {
                if ((i and (1 shl j)) != 0) {
                    subset.add(nums[j])
                }
            }
            result.add(subset)
        }

        return result
    }
}

fun main() {
    val solution = Solution()
    val res = solution.subsets(intArrayOf(1, 2, 3))
    for (i in res) {
        print("[")
        for (j in i.indices) {
            if (j != i.size - 1) {
                print("${i[j]}, ")
            } else {
                print("${i[j]}")
            }
        }
        println("]")
    }
}
