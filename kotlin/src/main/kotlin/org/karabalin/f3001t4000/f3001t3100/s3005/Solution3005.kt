package org.karabalin.f3001t4000.f3001t3100.s3005

class Solution {
    fun maxFrequencyElements(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        var maxFreq = 0
        for (x in nums) {
            val xInMap = map[x]
            if (xInMap == null) {
                map[x] = 1
                maxFreq = maxOf(maxFreq, 1)
            } else {
                map.replace(x, xInMap + 1)
                maxFreq = maxOf(maxFreq, xInMap + 1)
            }
        }
        var result = 0
        map.values.forEach { p0 ->
            if (p0 == maxFreq) {
                result += maxFreq
            }
        }
        return result
    }
}

fun main() {
    val solution = Solution()
    print(solution.maxFrequencyElements(intArrayOf(1, 2, 2, 3, 1, 4)))
}
