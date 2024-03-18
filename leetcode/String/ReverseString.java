import java.util.Stack;

class Solution {
    public void reverseString(char[] s) {
        Stack<Character> result = new Stack<>();

        for (int i = 0; i < s.length; i++) {
            result.push(s[i]);
        }

        for (int i = 0; i < s.length; i++) {
            s[i] = result.pop();
        }
    }
}
