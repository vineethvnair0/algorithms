import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    BubbleSort bubbleSort;

    @Before
    public void setup(){
        bubbleSort = new BubbleSort();
    }

    @Test(expected = NullPointerException.class)
    public void testNull(){
        bubbleSort.sort(null);
    }

    @Test
    public void testEmpty(){
        int[] a = {};
        int[] result = bubbleSort.sort(a);
        assertArrayEquals(a,result);
    }

    @Test
    public void testSortOdd(){
        int[] a = {5,1,4,2,8};
        int[] expected = {1,2,4,5,8};
        int[] result = bubbleSort.sort(a);
        assertArrayEquals(expected,result);
    }

    @Test
    public void testSortEven(){
        int[] a = {5,8,1,3,9,6};
        int[] result = bubbleSort.sort(a);
        int[] expected = {1,3,5,6,8,9};
        assertArrayEquals(expected,result);
    }
}
