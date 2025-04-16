package org.karabalin.f1001t2000.f1501t1600.s1550

class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        for (i in 0 until arr.size - 2) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true
            }
        }
        return false
    }
}

fun main() {
    val solution = Solution()
    println(solution.threeConsecutiveOdds(intArrayOf(2, 6, 4, 1, 3, 5)))
    println(solution.threeConsecutiveOdds(intArrayOf(1, 2, 34, 3, 4, 5, 7, 23, 12)))
    println(solution.threeConsecutiveOdds(intArrayOf(2, 4, 6, 8)))
}
