package foundation.misc;

import java.util.Arrays;

public class SearchInString {

	static boolean search(String str, char c) {

		if (str.isEmpty()) {
			System.out.println("enter a value");
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {

		String name = "chris";
		System.out.println(Arrays.toString(name.toCharArray()));
	}

}
