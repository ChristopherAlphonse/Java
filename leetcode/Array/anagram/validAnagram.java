package anagram;

/*
 * 242. Valid Anagram Easy Topics Companies Given two strings s and t, return true if t is an
 * anagram of s, and false otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram" Output: true Example 2:
 * 
 * Input: s = "rat", t = "car" Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length, t.length <= 5 * 104 s and t consist of lowercase English letters.
 * 
 * 
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to
 * such a case?
 */
// time 0(n) and space 0(1)

public class validAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int count[] = new int[26];
        // 0(1)

        // extract char from s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        // extract char from t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            count[c - 'a']--;
        }

        // compare

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                return false;
            }
        }
        return true;

    }

}
