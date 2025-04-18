package org.karabalin.f0001t1000.f0000t0100.s0038

class Solution {
    fun countAndSay(n: Int): String {
        if (n == 1) {
            return "1"
        } else {
            var result = rle("1")
            var i = 1
            while (i < n - 1) {
                result = rle(result)
                ++i
            }
            return result
        }
    }

    private fun rle(nStr: String): String {
        var num = nStr[0]
        var countOfNum = 1
        val result = StringBuilder()
        for (i in 1 until nStr.length) {
            if (num == nStr[i]) {
                ++countOfNum
            } else {
                result
                    .append(countOfNum)
                    .append(num)
                num = nStr[i]
                countOfNum = 1
            }
        }
        result
            .append(countOfNum)
            .append(num)
        return result.toString()
    }
}

fun main() {
    val solution = Solution()
    println(solution.countAndSay(4))
}
