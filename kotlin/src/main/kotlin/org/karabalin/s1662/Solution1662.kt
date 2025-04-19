package org.karabalin.s1662

class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        val s1 = word1.joinToString("")
        val s2 = word2.joinToString("")
        return s1 == s2
    }
}

fun main() {
    val solution = Solution()
    val word1 = arrayOf("abc", "d", "defg")
    val word2 = arrayOf("abcddefg")
    println(solution.arrayStringsAreEqual(word1, word2))
}
