package Leetcode.palindrome;

public class IsPalindromeNumber {

    // time is 0(log(x)) and space is 0(1)
    public boolean isPalindrome(int x) {
        // Special case: negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        // Reverse the number
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Check if the reversed number is equal to the original
        return original == reversed;
    }
}
