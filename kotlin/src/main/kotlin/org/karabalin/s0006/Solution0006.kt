package org.karabalin.s0006

class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) {
            return s
        }

        var column = 0
        var row = 0
        val numColumns = s.length
        val arr = Array(numRows) { Array(numColumns) { ' ' } }
        var i = 0
        while (i < s.length) {
            val c = s[i]
            if (column % (numRows - 1) == 0) {
                arr[row][column] = c
                ++i
            } else {
                if ((row + column) % (numRows - 1) == 0) {
                    arr[row][column] = c
                    ++i
                }
            }

            ++row
            if (row == numRows) {
                ++column
                row = 0
            }
        }

        val stringBuilder = StringBuilder()
        for (i in 0 until numRows) {
            for (j in 0 until numColumns) {
                val c = arr[i][j]
                if (c != ' ') {
                    stringBuilder.append(c)
                }
            }
        }
        return stringBuilder.toString()
    }
}

fun main() {
    val solution = Solution()
    println(solution.convert("PAYPALISHIRING", 4))
}
