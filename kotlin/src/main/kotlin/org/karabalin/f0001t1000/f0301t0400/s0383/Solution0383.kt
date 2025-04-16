package org.karabalin.f0001t1000.f0301t0400.s0383

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val remaining = StringBuilder(ransomNote)

        if (ransomNote.length > magazine.length) return false

        for (c in magazine) {
            val index = remaining.indexOf(c.toString())
            if (index != -1) {
                remaining.deleteCharAt(index)
            }
        }

        return remaining.isEmpty()
    }
}

fun main() {
    val solution = Solution()
    println(solution.canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"))
    println(solution.canConstruct("aa", "aab"))
}
