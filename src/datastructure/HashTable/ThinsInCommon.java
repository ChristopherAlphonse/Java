package datastructure.HashTable;

import java.util.HashMap;
import java.util.Map;

public class ThinsInCommon {


	// brute force
	public static boolean isSame(int[] n, int[] k) {
		for (int i : n) {
			for (int j : k) {
				if (i == j)
					return true;
			}
		}
		return false;
	}

	// optimal
	public static boolean isEqual(int[] z, int[] x) {
		Map<Integer, Boolean> map = new HashMap<>();

		for (int i : z) {
			map.put(i, true);
		}
		for (int i : x) {
			if (map.get(i) != null)
				return true;
		}
		return false;
	}


	public static void main(String[] args) {
		int[] arr1 = {2, 3, 4, 5};
		int[] arr2 = {0, 9, 7, 2};

		System.out.println(isEqual(arr1, arr2));
	}

}
