package org.karabalin.s0013

class Solution {
    fun romanToInt(s: String): Int {
        var prev = '0'
        var result = 0

        for (c in s) {
            when (c) {
                'I' -> result += 1

                'V' -> result += if (prev == 'I') 3 else 5
                'X' -> result += if (prev == 'I') 8 else 10

                'L' -> result += if (prev == 'X') 30 else 50
                'C' -> result += if (prev == 'X') 80 else 100

                'D' -> result += if (prev == 'C') 300 else 500
                'M' -> result += if (prev == 'C') 800 else 1000
            }
            prev = c
        }

        return result
    }
}

fun main() {
    val solution = Solution()
    println(solution.romanToInt("MCMXCIV"))
    println(solution.romanToInt("III"))
    println(solution.romanToInt("LVIII"))
}
