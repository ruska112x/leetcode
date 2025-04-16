package org.karabalin.f1001t2000.f1301t1400.s1346

class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()

        for ((i, num) in arr.withIndex()) {
            if (map.containsKey(num * 2) || (num % 2 == 0 && map.containsKey(num / 2))) {
                return true
            }
            map[num] = i
        }

        return false
    }
}

fun main() {
    val solution = Solution()
    println(solution.checkIfExist(intArrayOf(10, 2, 5, 3)))
    println(solution.checkIfExist(intArrayOf(3, 1, 7, 11)))
    println(solution.checkIfExist(intArrayOf(0, 0)))
}
