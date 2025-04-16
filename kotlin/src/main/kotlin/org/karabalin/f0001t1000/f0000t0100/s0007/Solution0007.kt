package org.karabalin.f0001t1000.f0000t0100.s0007

import kotlin.math.abs

class Solution {
    fun reverse(x: Int): Int {
        val isNegative = x < 0
        val absX = abs(x.toLong())
        val absStr = absX.toString()
        val reversedStr = absStr.reversed()
        val reversedLong = reversedStr.toLong()

        val result = if (isNegative) -reversedLong else reversedLong

        return if (result < Int.MIN_VALUE || result > Int.MAX_VALUE) {
            0
        } else {
            result.toInt()
        }
    }
}

fun main() {
    val solution = Solution()
    println(solution.reverse(123))
    println(solution.reverse(-456))
    println(solution.reverse(1534236469))
    println(solution.reverse(-2147483648))
}
