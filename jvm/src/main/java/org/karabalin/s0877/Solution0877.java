package org.karabalin.s0877;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

class Solution {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int a = 0, b = 0;
        for (int i = 0; i < piles.length - 1; ++i) {
            b += piles[i++];
            a += piles[i];
        }
        return a > b;
    }
}

public class Solution0877 {
    public static void main(String[] args) {
        var s = new Solution();
        Assertions.assertTrue(s.stoneGame(new int[]{5, 3, 4, 5}));
    }
}
