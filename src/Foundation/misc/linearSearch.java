package Foundation.misc;

public class linearSearch {

	public static boolean linearSearch(int[] data, int value) {
		for (int element : data) {
			if (element == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] d = {1, 2, 3, 4, 5, 6, 7, 8};
		int v = 7;

		boolean found = linearSearch(d, v);

		System.out.println("Value found: " + found);
	}
}

// O(n)
