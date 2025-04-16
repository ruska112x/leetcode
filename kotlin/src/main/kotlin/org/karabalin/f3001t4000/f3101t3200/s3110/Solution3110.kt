package org.karabalin.f3001t4000.f3101t3200.s3110

import kotlin.math.abs

class Solution {
    fun scoreOfString(s: String): Int {
        var result = 0
        for (i in 0 until s.length - 1) {
            val c1 = s[i].code
            val c2 = s[i + 1].code
            result += abs(c1 - c2)
        }
        return result
    }
}

fun main() {
    val s = Solution()
    println(s.scoreOfString("hello"))
    println(s.scoreOfString("zaz"))
}