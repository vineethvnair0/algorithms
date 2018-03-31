import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    QuickSort quickSort;

    @Before
    public void setup(){
        quickSort = new QuickSort();
    }

    @Test (expected = NullPointerException.class)
    public void testNull(){
        quickSort.sort(null);
    }

    @Test
    public void testEmptyArray(){
        int[] a = {};
        int[] result = quickSort.sort(a);
        assertArrayEquals(a,result);
    }

    @Test
    public void testMergeSortEven(){
        int[] a = {2,4,1,6,8,5,3,7};
        int[] result = quickSort.sort(a);
        int[] expected = {1,2,3,4,5,6,7,8};
        assertArrayEquals(expected,result);
    }

    @Test
    public void testSortForOdd(){
        int[] a = {2,4,1,6,8,3,7};
        int[] expected = {1,2,3,4,6,7,8};
        int[] result = quickSort.sort(a);
        assertArrayEquals(expected,result);
    }
}
