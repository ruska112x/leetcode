package org.karabalin.s0168

class Solution {
    fun convertToTitle(columnNumber: Int): String {
        var number = columnNumber
        val result = StringBuilder()

        while (number != 0) {
            number--
            val char = 'A' + (number % 26)
            result.insert(0, char)
            number /= 26
        }

        return result.toString()
    }
}

fun main() {
    val solution = Solution()
    println(solution.convertToTitle(1))
    println(solution.convertToTitle(28))
    println(solution.convertToTitle(701))
    println(solution.convertToTitle(2147483647))
}
