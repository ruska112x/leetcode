package org.karabalin.f0001t1000.f0000t0100.s0003

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val charSet = mutableSetOf<Char>()
        var maxLength = 0

        for (i in s.indices) {
            charSet.clear()
            for (j in i until s.length) {
                if (charSet.contains(s[j])) {
                    break
                }
                charSet.add(s[j])
                if (charSet.size > maxLength) {
                    maxLength = charSet.size
                }
            }
        }

        return maxLength
    }
}

fun main() {
    val solution = Solution()
    println(solution.lengthOfLongestSubstring("abcabcbb"))
}
