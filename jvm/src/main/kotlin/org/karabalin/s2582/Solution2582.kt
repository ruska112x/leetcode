package org.karabalin.s2582

class Solution {
    fun passThePillow(n: Int, time: Int): Int {
        val p = time % (2 * n - 2);
        return if (p > n - 1) {
            n - (p - n + 1);
        } else {
            p + 1;
        }
    }
}

fun main() {
    val s = Solution()
    println(s.passThePillow(4, 5))
    println(s.passThePillow(3, 2))
}
