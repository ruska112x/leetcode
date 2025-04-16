package org.karabalin.f0001t1000.f0000t0100.s0009

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false

        val str = x.toString()
        for (i in 0 until str.length / 2) {
            if (str[i] != str[str.length - i - 1]) {
                return false
            }
        }
        return true
    }
}

fun main() {
    val solution = Solution()
    println(solution.isPalindrome(123321))
    println(solution.isPalindrome(12321))
    println(solution.isPalindrome(12345))
    println(solution.isPalindrome(-121))
}
