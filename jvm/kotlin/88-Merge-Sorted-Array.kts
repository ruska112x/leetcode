class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var i = 0
        var j = 0
        var k = 0
        val s = nums1.size + nums2.size
        val arr = IntArray(s)
        while (i < nums1.size && j < nums2.size) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++]
            } else {
                arr[k++] = nums2[j++]
            }
        }
        while (i < nums1.size) {
            arr[k++] = nums1[i++]
        }
        while (j < nums2.size) {
            arr[k++] = nums2[j++]
        }
        return if (s % 2 == 0) {
            (arr[(s / 2) - 1] + arr[(s / 2)]) / 2.0
        } else {
            arr[(s / 2)].toDouble()
        }
    }
}

val s = Solution()

println(s.findMedianSortedArrays(arrayOf(1, 2).toIntArray(), arrayOf(3, 4).toIntArray()))
println(s.findMedianSortedArrays(arrayOf(1, 3).toIntArray(), arrayOf(2).toIntArray()))
println(s.findMedianSortedArrays(arrayOf(1, 2).toIntArray(), arrayOf(3, 4, 5, 6).toIntArray()))
