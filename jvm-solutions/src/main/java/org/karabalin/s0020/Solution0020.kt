package org.karabalin.s0020

import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        if (s.length % 2 == 1) {
            return false
        }
        val map = mapOf('(' to ')', '{' to '}', '[' to ']')
        val stack = Stack<Char>()
        for (c in s.toCharArray()) {
            val cc = map.getOrDefault(c, null)
            if (cc == null) {
                if (stack.isEmpty()) {
                    return false
                }
                val ct = map[stack.peek()]
                if (c != ct) {
                    return false
                } else {
                    stack.pop()
                }
            } else {
                stack.push(c)
            }
        }
        return stack.isEmpty()
    }
}

fun main() {
    val s = Solution()
    println(s.isValid("()[]{}"))
    println(s.isValid("(}"))
    println(s.isValid("){"))
    println(s.isValid(")"))
}
