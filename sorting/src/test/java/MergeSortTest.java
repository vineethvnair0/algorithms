import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    MergeSort mergeSort;

    @Before
    public void setup(){
        mergeSort = new MergeSort();
    }

    @Test(expected = NullPointerException.class)
    public void testSortForNull(){
        mergeSort.sort(null);
    }

    @Test
    public void testSortForEmptyArray(){
        int[] a = {};
        int[] result = mergeSort.sort(a);
        assertArrayEquals(a,result);
    }


    @Test
    public void testMergeSortEven(){
        int[] a = {2,4,1,6,8,5,3,7};
        int[] result = mergeSort.sort(a);
        int[] expected = {1,2,3,4,5,6,7,8};
        assertArrayEquals(expected,result);
    }

    @Test
    public void testMergeSortOdd(){
        int[] a = {38,27,43,3,9,82,10};
        int[] result = mergeSort.sort(a);
        int[] expected = {3,9,10,27,38,43,82};
        assertArrayEquals(expected,result);
    }
}
