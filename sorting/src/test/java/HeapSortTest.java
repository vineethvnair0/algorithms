import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HeapSortTest {

    HeapSort heapSort;

    @Before
    public void setup(){
        heapSort = new HeapSort();
    }

    @Test(expected = NullPointerException.class)
    public void testNull(){
        heapSort.sort(null);
    }

    @Test
    public void testEmpty(){
        int[] a = {};
        heapSort.sort(a);
        int[] expected = {};
        assertArrayEquals(expected,a);

    }

    @Test
    public void testHeapify(){
        int[] a = {1,12,9,5,6,10};
        for (int i = a.length/2-1;i>=0;i--){
            heapSort.maxHeapify(a,a.length-1,i);
        }
        int[] expected = {12,6,10,5,1,9};
        assertArrayEquals(expected,a);
    }

    @Test
    public void testEvenSort(){
        int[] a = {1,12,9,5,6,10};
        heapSort.sort(a);
        int[] expected = {1,5,6,9,10,12};
        assertArrayEquals(expected,a);
    }

    @Test
    public void testOddSort(){
        int[] a = {1,12,9,5,6,10,2};
        heapSort.sort(a);
        int[] expected = {1,2,5,6,9,10,12};
        assertArrayEquals(expected,a);
    }
}
