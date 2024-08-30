package org.karabalin.s1920;

import org.junit.jupiter.api.Assertions;

class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}

public class Solution1920 {
    public static void main(String[] args) {
        var s = new Solution();
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, s.buildArray(new int[]{0, 2, 1, 5, 3, 4}));
    }
}
