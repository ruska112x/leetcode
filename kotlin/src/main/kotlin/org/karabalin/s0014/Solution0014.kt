package org.karabalin.s0014

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var minLength = strs[0].length
        for (i in 1 until strs.size) {
            if (strs[i].length < minLength) {
                minLength = strs[i].length
            }
        }

        val result = StringBuilder()
        for (i in 0 until minLength) {
            val currentChar = strs[0][i]
            for (j in 1 until strs.size) {
                if (strs[j][i] != currentChar) {
                    return result.toString()
                }
            }
            result.append(currentChar)
        }

        return result.toString()
    }
}

fun main() {
    val solution = Solution()
    val strs = arrayOf("flower", "flow", "flight")
    println(solution.longestCommonPrefix(strs))
}
