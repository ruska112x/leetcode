package org.karabalin.f0001t1000.f0701t0800.s0791

class Solution {
    fun customSortString(order: String, s: String): String {
        val freqMap = mutableMapOf<Char, Int>()
        val notInOrder = StringBuilder()

        for (c in s) {
            if (order.contains(c)) {
                freqMap[c] = freqMap.getOrDefault(c, 0) + 1
            } else {
                notInOrder.append(c)
            }
        }

        val result = StringBuilder()

        for (c in order) {
            val count = freqMap[c] ?: continue
            repeat(count) {
                result.append(c)
            }
        }

        result.append(notInOrder)

        return result.toString()
    }
}

fun main() {
    val solution = Solution()
    println(solution.customSortString("cba", "abcd"))
}
