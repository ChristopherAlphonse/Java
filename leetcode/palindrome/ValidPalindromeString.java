package leetcode.palindrome;

public class ValidPalindromeString {

    /**
     * 1. Initialize pointers for the start and end of the string. Iterate until the pointers meet.
     * 2. Skip non-alphanumeric characters from the left. 3. Skip non-alphanumeric characters from
     * the 4. right. Compare characters at pointers (ignoring case). 5. If characters don't match,
     * it's not a 6. palindrome. Move pointers towards the center. 7. If the loop completes, the
     * string is a valid palindrome
     * 
     * @param s
     * @return
     * 
     */

    // more efficient time: o(n) space 0(1)
    public boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    // less efficient 0(n) for time and space 0(n)

    public boolean validPalindromeClean(String s) {
        // Remove non-alphanumeric characters using regex
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the clean string is a palindrome
        return cleanString.equals(new StringBuilder(cleanString).reverse().toString());
    }
}
