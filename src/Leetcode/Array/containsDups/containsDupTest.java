package Leetcode.Array.containsDups;

import static org.junit.Assert.*;
import org.junit.Test;

public class containsDupTest {
    @Test
    public void testContainsDuplicateTest() {
        containsDup solution = new containsDup();

        int[] case3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue("Case 3 failed", solution.containsDuplicate(case3));

        int[] case2 = {1, 2, 3, 4};
        assertFalse("Case 2 failed", solution.containsDuplicate(case2));

        int[] case1 = {1, 2, 3, 1};
        assertTrue("Case 1 failed", solution.containsDuplicate(case1));
    }
}
