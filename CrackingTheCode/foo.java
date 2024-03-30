package CrackingTheCode;

import java.util.Arrays;

public class foo {
	public static void foo(int[] array) {
		int sum = 0;
		int product = 1;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		for (int i = 0; i < array.length; i++) {
			product += array[i];
		}
		System.out.println(sum + " " + product);
	}

	public static void main(String[] args) {
		int[] arr = {12345668};
		System.out.println(Arrays.toString(arr));
	}
}
