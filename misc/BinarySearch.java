package misc;

/**
 * BinarySearch
 */
public class BinarySearch {

	public static int indexOf(int[] nums, int key) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (key < nums[mid]) {
				high = mid - 1;
			} else if (key > nums[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 9;
		int index = indexOf(nums, key);
		if (index != -1) {
			System.out.println("Element " + key + " found at index " + index);
		} else {
			System.out.println("Element " + key + " not found ");
		}
	}
}
