import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {

    InsertionSort insertionSort;

    @Before
    public void setup(){
        insertionSort = new InsertionSort();
    }

    @Test(expected = NullPointerException.class)
    public void testSortForNull(){
        insertionSort.sort(null);
    }

    @Test
    public void testSortForEmptyArray(){
        int[] a = {};
        int[] result = insertionSort.sort(a);
        assertArrayEquals(a,result);
    }

    @Test
    public void testSortForValidArray1(){
        int[] a = {5,8,1,3,9,6};
        int[] result = insertionSort.sort(a);
        int[] expected = {1,3,5,6,8,9};
        assertArrayEquals(expected,result);
    }

    @Test
    public void testSortForValidArray2(){
        int[] a = {7,8,5,2,4,6,3};
        int[] result = insertionSort.sort(a);
        int[] expected = {2,3,4,5,6,7,8};
        assertArrayEquals(expected,result);
    }

}
