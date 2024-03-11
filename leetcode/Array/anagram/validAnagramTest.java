import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class validAnagramTest {

    @Test
    public void testValidAnagram() {
        validAnagram validAnagram = new validAnagram();

        String s1 = "anagram";
        String t1 = "nagaram";
        assertTrue(validAnagram.isAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        assertFalse(validAnagram.isAnagram(s2, t2));

        String s3 = "listen";
        String t3 = "silent";
        assertTrue(validAnagram.isAnagram(s3, t3));

        String s4 = "";
        String t4 = "";
        assertTrue(validAnagram.isAnagram(s4, t4));

        String s5 = "hello";
        String t5 = "world";
        assertFalse(validAnagram.isAnagram(s5, t5));
    }
}
