import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class CountingSortNegativeTest {

    CountingSortNegative countingSortNegative;

    @Before
    public void setup(){
        countingSortNegative = new CountingSortNegative();
    }

    @Test(expected = NullPointerException.class)
    public void testNull(){
        countingSortNegative.sort(null);
    }

    @Test
    public void testEmpty(){
        int[] a = {};
        int[] result = countingSortNegative.sort(a);
        assertArrayEquals(a,result);
    }

    @Test
    public void testFindMin(){
        int[] a = {8,9,6,-3,1,4,-2};
        int minResult = countingSortNegative.findMin(a);
        assertEquals(3,minResult);
    }

    @Test
    public void testFindMax(){
        int[] a = {8,9,6,-3,1,4,-2};
        int minResult = countingSortNegative.findMax(a);
        assertEquals(9,minResult);
    }

    @Test
    public void testValidScenarioWithCombinationOfNegativePositive(){
        int[] a = {8,9,6,-3,1,4,-2};
        int[] result = countingSortNegative.sort(a);
        int[] expected = {-3,-2,1,4,6,8,9};
        assertArrayEquals(expected,result);
    }

    @Test
    public void testValidScenarioWithOnlyNegative(){
        int[] a = {-8,-9,-6,-3,-1,-4,-2};
        int[] result = countingSortNegative.sort(a);
        int[] expected = {-9,-8,-6,-4,-3,-2,-1};
        assertArrayEquals(expected,result);
    }

    @Test
    public void testValidScenarioWithOnlyPositive(){
        int[] a = {8,9,6,3,1,4,2};
        int[] result = countingSortNegative.sort(a);
        int[] expected = {1,2,3,4,6,8,9};
        assertArrayEquals(expected,result);
    }

    @Test
    public void testWithRepettingNegativeNumbers(){
        int[] a = {-4,-5,-4,-6,-4,3,5,6,2,1};
        int[] result = countingSortNegative.sort(a);
        int[] expected = {-6,-5,-4,-4,-4,1,2,3,5,6};
        assertArrayEquals(expected,result);
    }

    @Test
    public void testWithRepettingPositiveNumbers(){
        int[] a = {4,-5,4,-6,4,3,5,6,2,1};
        int[] result = countingSortNegative.sort(a);
        int[] expected = {-6,-5,1,2,3,4,4,4,5,6};
        assertArrayEquals(expected,result);
    }
}
