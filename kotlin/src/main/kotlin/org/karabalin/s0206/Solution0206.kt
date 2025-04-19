package org.karabalin.s0206

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var curr = head
        var prev: ListNode? = null

        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }

        return prev
    }
}

fun printList(head: ListNode?) {
    var node = head
    while (node != null) {
        print("${node.`val`} -> ")
        node = node.next
    }
    println("null")
}

fun main() {
    val n3 = ListNode(3)
    val n2 = ListNode(2).apply { next = n3 }
    val n1 = ListNode(1).apply { next = n2 }

    val solution = Solution()
    val reversed = solution.reverseList(n1)
    printList(reversed)
}
