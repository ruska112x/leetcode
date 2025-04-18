package org.karabalin.f2001t3000.f2801t2900.s2807

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
        var cur = head
        var next = head?.next
        while (next != null) {
            val newVal = gcd(cur!!.`val`, next.`val`)
            val newNode = ListNode(newVal)
            newNode.next = next
            cur.next = newNode
            cur = next
            next = next.next
        }
        return head
    }

    private fun gcd(num1: Int, num2: Int): Int {
        if (num2 == 0) {
            return num1
        }
        return gcd(num2, num1 % num2)
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
    val li1 = ListNode(18)
    val li2 = ListNode(6)
    val li3 = ListNode(10)
    val li4 = ListNode(3)
    li1.next = li2
    li2.next = li3
    li3.next = li4
    val solution = Solution()
    val result = solution.insertGreatestCommonDivisors(li1)
    printList(result)
}
