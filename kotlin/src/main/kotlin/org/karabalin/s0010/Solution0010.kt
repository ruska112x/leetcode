package org.karabalin.s0010


///**
// * it works, but it seems cheating
// */
//class Solution {
//    fun isMatch(s: String, p: String): Boolean {
//        val regex = Regex(p)
//        return regex.matches(s)
//    }
//}

class Solution {
    fun isMatch(text: String, pattern: String): Boolean {
        if (pattern.isEmpty()) return text.isEmpty()
        val firstMatch = (!text.isEmpty() && (pattern[0] == text[0] || pattern[0] == '.'))

        return if (pattern.length >= 2 && pattern[1] == '*') {
            (isMatch(text, pattern.substring(2)) || (firstMatch && isMatch(text.substring(1), pattern)))
        } else {
            (firstMatch && isMatch(text.substring(1), pattern.substring(1)))
        }
    }
}

fun main() {
    val solution = Solution()
    println(solution.isMatch("aa", "a*"))
}
