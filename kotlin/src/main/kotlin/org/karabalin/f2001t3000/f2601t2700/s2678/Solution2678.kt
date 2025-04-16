package org.karabalin.f2001t3000.f2601t2700.s2678

class Solution {
    fun countSeniors(details: Array<String>): Int {
        var result = 0
        for (s in details) {
            val age = s.substring(11, 13).toInt()
            if (age > 60) {
                result++
            }
        }
        return result
    }
}

fun main() {
    val solution = Solution()
    val details = arrayOf(
        "7868190130M7522",
        "5303914400F9211",
        "9273338290F4010"
    )
    println(solution.countSeniors(details))
}
