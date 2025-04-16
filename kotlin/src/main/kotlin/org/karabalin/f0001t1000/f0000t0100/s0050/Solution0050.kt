package org.karabalin.f0001t1000.f0000t0100.s0050

class Solution {
    fun myPow(x: Double, n: Int): Double {
        if (n == 0) return 1.0

        if (n == Int.MAX_VALUE) {
            return when (x) {
                1.0 -> 1.0
                -1.0 -> -1.0
                else -> 0.0
            }
        }

        if (n == Int.MIN_VALUE) {
            return when (x) {
                1.0, -1.0 -> 1.0
                else -> 0.0
            }
        }

        var base = x
        var exponent = n
        var result = 1.0

        if (exponent < 0) {
            base = 1 / base
            exponent = -exponent
        }

        repeat(exponent) {
            result *= base
        }

        return result
    }
}

fun main() {
    val solution = Solution()
    println(solution.myPow(2.0, 10))
    println(solution.myPow(2.0, -2))
    println(solution.myPow(0.00001, Int.MAX_VALUE))
    println(solution.myPow(-1.0, Int.MIN_VALUE))
}
