package org.karabalin.s0501

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    private val modes = mutableListOf<Int>()
    private var currVal = Int.MIN_VALUE
    private var currCount = 0
    private var maxCount = 0

    fun findMode(root: TreeNode?): IntArray {
        currVal = Int.MIN_VALUE
        inorder(root)
        return modes.toIntArray()
    }

    private fun inorder(node: TreeNode?) {
        if (node == null) return

        inorder(node.left)

        if (currVal != node.`val`) {
            currVal = node.`val`
            currCount = 0
        }

        currCount++

        when {
            currCount == maxCount -> modes.add(currVal)
            currCount > maxCount -> {
                modes.clear()
                modes.add(currVal)
                maxCount = currCount
            }
        }

        inorder(node.right)
    }
}

fun main() {
    val root = TreeNode(1).apply {
        right = TreeNode(2).apply {
            left = TreeNode(2)
        }
    }

    val solution = Solution()
    println(solution.findMode(root).joinToString())
}
