public static String reverseString(String string) {
	Stack<Character> stack = new Stack<>();
	String reversedString = "";

	for (char c : string.toCharArray()) {
		stack.push(c);
	}

	while (!stack.isEmpty()) {
		reversedString += stack.pop();
	}

	return reversedString;
}

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
/*
 * public String reverseString(String str) { int length = str.length(); StringBuilder reversed = new
 * StringBuilder(length);
 * 
 * for (int i = length - 1; i >= 0; i--) { reversed.append(str.charAt(i)); }
 * 
 * return reversed.toString(); }
 */
