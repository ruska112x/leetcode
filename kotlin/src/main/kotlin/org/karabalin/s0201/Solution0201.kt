package org.karabalin.s0201

class Solution {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var l = left
        var r = right
        var shift = 0

        while (l < r) {
            l = l shr 1
            r = r shr 1
            shift++
        }

        return l shl shift
    }
}

fun main() {
    val solution = Solution()
    println(solution.rangeBitwiseAnd(5, 7))
    println(solution.rangeBitwiseAnd(0, 1))
    println(solution.rangeBitwiseAnd(10, 11))
}
