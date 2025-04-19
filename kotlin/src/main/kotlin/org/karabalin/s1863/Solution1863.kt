package org.karabalin.s1863

class Solution {
    fun subsetXORSum(nums: IntArray): Int {
        var sum = 0
        val subsets = getSubsets(nums)
        for (i in 0 until subsets.size) {
            var subsetSum = 0
            val subset = subsets[i]
            for (j in 0 until subset.size) {
                subsetSum = subsetSum xor subset[j]
            }
            sum += subsetSum
        }
        return sum
    }

    private fun getSubsets(arr: IntArray): MutableList<MutableList<Int>> {
        val n = arr.size
        val result = mutableListOf<MutableList<Int>>()

        for (i in 0 until (1 shl n)) {
            val subset = mutableListOf<Int>()
            for (j in 0 until n) {
                if ((i and (1 shl j)) != 0) {
                    subset.add(arr[j])
                }
            }
            result.add(subset)
        }

        return result
    }
}

fun main() {
    val solution = Solution()
    println(solution.subsetXORSum(intArrayOf(1, 3)))
    println(solution.subsetXORSum(intArrayOf(5, 1, 6)))
    println(solution.subsetXORSum(intArrayOf(3, 4, 5, 6, 7, 8)))
}
