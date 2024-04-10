package CrackingTheCode;

import java.util.Arrays;

public class checkPermutation {
	String sort(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

	/*
	 * if two strings are permutations of each other, then we know we have two of the same
	 * string,char,and spaces.
	 */
	boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		} // permutation must be the same length

		int[] abc = new int[128]; // Assumption: ASCII

		for (int i = 0; i < s.length(); i++) {
			abc[s.charAt(i)]++;
		}

		for (int i = 0; i < t.length(); i++) {
			abc[s.charAt(i)]--;
			if (abc[t.charAt(i)] < 0) {
				return false;
			}
		}


		return true;// abc has no negative value and therefore neither does it poses positive.
	}



	public static void main(String[] args) {
		checkPermutation cp = new checkPermutation();
		System.out.println(cp.permutation("enlist", "listen"));
		// counted spaces in here
	}
}


