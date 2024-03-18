
//
// Big0(n)
// class Solution {
// public void reverseString(char[] s) {
// Stack<Character> result = new Stack<>();

// for(int i = 0; i < s.length; i++ ) {
// result.push(s[i]);
// }

// for(int i = 0; i < s.length; i++ ) {
// s[i] = result.pop();
// }
// }
// }

// 0(1) space
// two pointer, dive and conquer, string
class Solution {
    public void reverseString(char[] s) {
        // start at the beginning
        int left = 0;
        // start at end
        int right = s.length - 1;

        while (left <= right) {
            // method to clarify my idea
            swap(s, left, right);

            // move up 1
            left++;
            // move down 1
            right--;
        }

    }

    // custom swap method
    private void swap(char[] s, int a, int b) {
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}
