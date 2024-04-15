package org.karabalin;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {
    static class Solution {
        public boolean isValid(String s) {
            Map<Character, Character> map = new HashMap<>();
            map.put('(', ')');
            map.put('{', '}');
            map.put('[', ']');
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                Character cc = map.getOrDefault(c, null);
                if (cc == null) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        stack.push(c);
                    }
                    if (cc != stack.pop()) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
