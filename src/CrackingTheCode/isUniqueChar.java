package CrackingTheCode;

// base on Unicode() or ASCII(256 char but only 128 are used)

public class isUniqueChar {
	boolean isUniqueChar(String s) {
		if (s.length() > 128)
			return false;

		boolean[] charSet = new boolean[128];
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			if (charSet[val]) {
				return false;
			}
			charSet[val] = true;
		}

		return true;

	}

	// use bitwise

	boolean isUniquesChar(String str) {
		int check = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((check & (1 << val)) > 0) {
				return false;
			}
			check |= (1 << val);
		}
		return true;
	}

	public static void main(String[] args) {
		isUniqueChar obj = new isUniqueChar();

		System.out.println(obj.isUniquesChar("abcdefghijklmnopqrstuvwxyz"));
	}


}
