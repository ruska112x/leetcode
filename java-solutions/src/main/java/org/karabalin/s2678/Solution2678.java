package org.karabalin.s2678;

import org.junit.jupiter.api.Assertions;

class Solution {
    public int countSeniors(String[] details) {
        int result = 0;
        for (String s : details) {
            if (Integer.parseInt(s.substring(11, 13)) > 60) {
                ++result;
            }
        }
        return result;
    }
}

public class Solution2678 {
    public static void main(String[] args) {
        var s = new Solution();
        Assertions.assertEquals(2, s.countSeniors(new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"}));
    }
}
