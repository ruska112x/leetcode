package org.karabalin.s0005

class Solution {
    fun longestPalindrome(s: String): String {
        var result = ""
        val len = s.length
        if (len == 1) {
            return s
        }
        for (i in len downTo 1) {
            for (j in 0 until len - i + 1) {
                val subS = s.substring(j, j + i)
                if (isPalindrome(subS)) {
                    result = subS
                    break
                }
            }
            if (result != "") {
                break
            }
        }
        return result
    }

    private fun isPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length - 1
        while (l < r) {
            if (s[l] != s[r]) {
                return false
            }
            ++l
            --r
        }
        return true
    }
}

fun main() {
    val solution = Solution()
    println(solution.longestPalindrome("babad"))
    println(solution.longestPalindrome("a"))
    println(solution.longestPalindrome("bb"))
}
