package org.karabalin.s1929;

import org.junit.jupiter.api.Assertions;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }
        return result;
    }
}

public class Solution1929 {
    public static void main(String[] args) {
        var s = new Solution();
        Assertions.assertArrayEquals(new int[]{1, 2, 1, 1, 2, 1}, s.getConcatenation(new int[]{1, 2, 1}));
    }
}
