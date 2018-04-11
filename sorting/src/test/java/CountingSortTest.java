import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class CountingSortTest {


    CountingSort countingSort;

    @Before
    public void setup(){
        countingSort = new CountingSort();
    }

    @Test(expected = NullPointerException.class)
    public void testNull(){
        countingSort.sort(null);
    }

    @Test
    public void testEmpty(){
        int[] arr = {};
        int[] result = countingSort.sort(arr);
        assertArrayEquals(arr,result);
    }

    @Test
    public void validSort1(){
        int[] arr = {1, 4, 1, 2, 7, 5, 2};
        int[] result = countingSort.sort(arr);
        int[] expected = {1,1,2,2,4,5,7};
        assertArrayEquals(expected,result);
    }
}
