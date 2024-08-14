package s0058

class Solution {
    fun lengthOfLastWord(s: String): Int {
        val strings = s.trim().split("\\s+".toRegex())
        return strings.last().length
    }
}

fun main() {
    val s = Solution()
    println(s.lengthOfLastWord("Hello World") == 5)
    println(s.lengthOfLastWord("   fly me   to   the moon  ") == 4)
}
