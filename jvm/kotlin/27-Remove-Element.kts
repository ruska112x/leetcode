class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val arr = ArrayList<Int>()
        for (e in nums) {
            if (e != `val`) {
                arr.add(e)
            }
        }
        for (i in 0 until arr.size) {
            nums[i] = arr[i]
        }
        return arr.size
    }
}

val s = Solution()

println(s.removeElement(arrayOf(0,1,2,2,3,0,4,2).toIntArray(), 2))
