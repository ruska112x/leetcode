package org.karabalin.s0404

import java.util.*

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        if (root == null) return 0

        val queue: Queue<Pair<TreeNode, Boolean>> = LinkedList()
        queue.offer(Pair(root, false))
        var totalSum = 0

        while (queue.isNotEmpty()) {
            val (node, isLeft) = queue.poll()

            if (isLeft && node.left == null && node.right == null) {
                totalSum += node.`val`
            }

            node.left?.let { queue.offer(Pair(it, true)) }
            node.right?.let { queue.offer(Pair(it, false)) }
        }

        return totalSum
    }
}

fun main() {
    val root = TreeNode(3).apply {
        left = TreeNode(9)
        right = TreeNode(20).apply {
            left = TreeNode(15)
            right = TreeNode(7)
        }
    }

    val solution = Solution()
    println(solution.sumOfLeftLeaves(root))
}
