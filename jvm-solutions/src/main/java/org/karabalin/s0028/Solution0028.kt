package org.karabalin.s0028

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (haystack.length < needle.length) {
            return -1
        }
        val l = haystack.length - needle.length
        for (i in 0..l) {
            val sub = haystack.substring(i, i + needle.length)
            if (sub == needle) {
                return i
            }
        }
        return -1
    }
}

fun main() {
    val s = Solution()
    println(s.strStr("sadbutsad", "sad") == 0)
    println(s.strStr(haystack = "leetcode", needle = "leeto") == -1)
    println(s.strStr(haystack = "a", needle = "a") == 0)
}
