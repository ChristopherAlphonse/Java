package Striver.Count_digits_in_a_number;

/*

Problem Statement: Given an integer N, return the number of digits in N.

Examples
Example 1:
Input:N = 12345
Output:5
Explanation:  The number 12345 has 5 digits.
Example 2:
Input:N = 7789
Output: 4
Explanation: The number 7789 has 4 digits.

*/

public class Main {


	public static int countDigits(int n){

		
					return n.toString().length();

	}






	public static void main(String[] args) {

		int n = 12345;
		System.out.println(countDigits(n));
	}

}
