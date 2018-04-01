import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    SelectionSort selectionSort;


    @Before
    public void setup(){
        selectionSort = new SelectionSort();
    }

    @Test(expected = NullPointerException.class)
    public void testWithNull(){
        selectionSort.sort(null);
    }

    @Test
    public void testWithEmptyArray(){
        int[] a = {};
        int[] result = selectionSort.sort(a);
        assertArrayEquals(a,result);
    }

    @Test
    public void testSortEven(){
        int[] a = {2,4,1,6,8,5,3,7};
        int[] result = selectionSort.sort(a);
        int[] expected = {1,2,3,4,5,6,7,8};
        assertArrayEquals(expected,result);
    }

    @Test
    public void testSorOdd(){
        int[] a = {5,8,1,3,9,6,2};
        int[] result = selectionSort.sort(a);
        int[] expected = {1,2,3,5,6,8,9};
        assertArrayEquals(expected,result);
    }
}
