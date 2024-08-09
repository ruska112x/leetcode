import java.util.TreeSet

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val set = TreeSet<Int>()
        for (e in nums) {
            set.add(e)
        }
        for (i in 0 until set.size) {
            nums[i] = set.elementAt(i)
        }
        return set.size
    }
}

val s = Solution()

println(s.removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
