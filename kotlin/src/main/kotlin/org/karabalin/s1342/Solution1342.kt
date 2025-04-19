package org.karabalin.s1342

class Solution {
    fun numberOfSteps(num: Int): Int {
        var n = num
        var steps = 0
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2
            } else {
                n -= 1
            }
            steps++
        }
        return steps
    }
}

fun main() {
    val solution = Solution()
    println(solution.numberOfSteps(14))
    println(solution.numberOfSteps(8))
    println(solution.numberOfSteps(123))
}
