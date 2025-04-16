package org.karabalin.f0001t1000.f0401t0500.s0401

class Solution {
    fun readBinaryWatch(turnedOn: Int): List<String> {
        val times = mutableListOf<String>()
        for (h in 0 until 12) {
            for (m in 0 until 60) {
                if (Integer.bitCount(h * 64 + m) == turnedOn) {
                    times.add(String.format("%d:%02d", h, m))
                }
            }
        }
        return times
    }
}

fun main() {
    val solution = Solution()
    println(solution.readBinaryWatch(1))
}
