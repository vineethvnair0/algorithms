import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortWithOneArrayTest {

    MergeSortWithOneArray mergeSortWithOneArray;

    @Before
    public void setup(){
        mergeSortWithOneArray = new MergeSortWithOneArray();
    }

    @Test(expected = NullPointerException.class)
    public void testSortForNull(){
        mergeSortWithOneArray.sort(null);
    }

    @Test
    public void testSortForEmpty(){
        int[] a = {};
        int[] result = mergeSortWithOneArray.sort(a);
        assertArrayEquals(a,result);
    }

    @Test
    public void testSortForOdd(){
        int[] a = {2,4,1,8,5,3,7};
        int[] expected = {1,2,3,4,5,7,8};
        int[] result = mergeSortWithOneArray.sort(a);
        assertArrayEquals(expected,result);
    }

    @Test
    public void testMergeSortEven(){
        int[] a = {2,4,1,6,8,5,3,7};
        int[] result = mergeSortWithOneArray.sort(a);
        int[] expected = {1,2,3,4,5,6,7,8};
        assertArrayEquals(expected,result);
    }

}
