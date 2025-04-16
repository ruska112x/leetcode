package org.karabalin.f1001t2000.f1101t1200.s1171

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun removeZeroSumSublists(head: ListNode?): ListNode? {
        val dummy = ListNode(0)
        dummy.next = head
        var current: ListNode? = dummy

        while (current != null) {
            var sum = 0
            var ptr = current.next
            while (ptr != null) {
                sum += ptr.`val`
                if (sum == 0) {
                    current.next = ptr.next
                }
                ptr = ptr.next
            }
            current = current.next
        }

        return dummy.next
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
    val node5 = ListNode(1)
    val node4 = ListNode(3).apply { next = node5 }
    val node3 = ListNode(-3).apply { next = node4 }
    val node2 = ListNode(2).apply { next = node3 }
    val node1 = ListNode(1).apply { next = node2 }

    val solution = Solution()
    val result = solution.removeZeroSumSublists(node1)
    printList(result)
}
