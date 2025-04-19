package org.karabalin.s0011

class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxSquare = 0

        while (left < right) {
            val width = right - left
            val h = minOf(height[left], height[right])
            val area = h * width
            maxSquare = maxOf(maxSquare, area)

            if (height[left] < height[right]) {
                left++
            } else if (height[left] > height[right]) {
                right--
            } else {
                left++
                right--
            }
        }

        return maxSquare
    }
}

fun main() {
    val solution = Solution()
    val h0 = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
    val h1 = intArrayOf(2, 3, 4, 5, 18, 17, 6)
    println(solution.maxArea(h0))
}
