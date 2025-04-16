package org.karabalin.f0001t1000.f0801t0900.s0876

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var slow = head
        var fast = head

        while (fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        return slow
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
    val n5 = ListNode(5)
    val n4 = ListNode(4).apply { next = n5 }
    val n3 = ListNode(3).apply { next = n4 }
    val n2 = ListNode(2).apply { next = n3 }
    val n1 = ListNode(1).apply { next = n2 }

    val solution = Solution()
    val middle = solution.middleNode(n1)
    printList(middle)
}
