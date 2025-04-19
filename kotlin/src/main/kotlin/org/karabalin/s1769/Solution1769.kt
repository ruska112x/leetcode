package org.karabalin.s1769

import kotlin.math.abs

class Solution {
    fun minOperations(boxes: String): IntArray {
        val result = mutableListOf<Int>()
        val map = mutableMapOf<Int, IntArray>()
        val zeros = mutableListOf<Int>()
        for (i in 0 until boxes.length) {
            zeros.add(0)
            result.add(0)
        }
        for (i in 0 until boxes.length) {
            val movesList = mutableListOf<Int>()
            if (boxes[i] == '1') {
                for (j in 0 until boxes.length) {
                    movesList.add(abs(j - i))
                }
                map[i] = movesList.toIntArray()
            } else {
                map[i] = zeros.toIntArray()
            }
        }
        for (i in 0 until boxes.length) {
            val mapI = map[i]!!
            for (j in 0 until mapI.size) {
                result[j] += mapI[j]
            }
        }
        return result.toIntArray()
    }
}

fun main() {
    val solution = Solution()
    solution.minOperations("110").forEach {
        print("$it ")
    }
    println()
    solution.minOperations("001011").forEach {
        print("$it ")
    }
    println()

    println(solution.minOperations("110").contentEquals(intArrayOf(1, 1, 3)))
    println(solution.minOperations("001011").contentEquals(intArrayOf(11, 8, 5, 4, 3, 4)))
}
