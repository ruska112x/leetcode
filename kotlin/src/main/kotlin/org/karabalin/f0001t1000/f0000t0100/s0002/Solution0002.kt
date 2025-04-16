package org.karabalin.f0001t1000.f0000t0100.s0002

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var ll1 = l1
        var ll2 = l2
        var carry = 0
        val dummyHead = ListNode(0)
        var current = dummyHead

        while (ll1 != null || ll2 != null || carry != 0) {
            val val1 = ll1?.`val` ?: 0
            val val2 = ll2?.`val` ?: 0
            val sum = val1 + val2 + carry

            carry = sum / 10
            current.next = ListNode(sum % 10)
            current = current.next!!

            ll1 = ll1?.next
            ll2 = ll2?.next
        }

        return dummyHead.next
    }
}

fun printList(node: ListNode?) {
    var current = node
    while (current != null) {
        print("${current.`val`}, ")
        current = current.next
    }
    println()
}

fun main() {
    val l1 = ListNode(9)
    l1.next = ListNode(9)
    l1.next!!.next = ListNode(9)
    l1.next!!.next!!.next = ListNode(9)
    l1.next!!.next!!.next!!.next = ListNode(9)
    l1.next!!.next!!.next!!.next!!.next = ListNode(9)
    l1.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)

    val l2 = ListNode(9)
    l2.next = ListNode(9)
    l2.next!!.next = ListNode(9)
    l2.next!!.next!!.next = ListNode(9)

    val solution = Solution()
    val result = solution.addTwoNumbers(l1, l2)

    printList(result)
}
