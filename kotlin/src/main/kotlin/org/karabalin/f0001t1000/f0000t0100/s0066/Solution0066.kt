package org.karabalin.f0001t1000.f0000t0100.s0066

import java.util.*

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val stack = Stack<Int>()
        var excess = 0
        for (i in digits.size - 1 downTo 0) {
            var num = digits[i]
            if (i == digits.size - 1) {
                ++num
                if (num > 9) {
                    excess = 1
                    num = 0
                }
            } else {
                num += excess
                if (num > 9) {
                    excess = 1
                    num = 0
                } else {
                    excess = 0
                }
            }
            stack.add(num)
        }
        if (excess != 0) {
            stack.add(excess)
        }
        val result = stack.toIntArray().reversedArray()
        return result
    }
}

fun main() {
    val s = Solution()
    println(s.plusOne(intArrayOf(9)).contentEquals(intArrayOf(1, 0)))
    println(s.plusOne(intArrayOf(1, 2, 3)).contentEquals(intArrayOf(1, 2, 4)))
}
