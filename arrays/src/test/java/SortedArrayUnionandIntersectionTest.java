import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortedArrayUnionandIntersectionTest {

    SortedArrayUnionandIntersection sortedArrayUnionandIntersection;

    @Before
    public void setup(){
        sortedArrayUnionandIntersection = new SortedArrayUnionandIntersection();
    }

    @Test(expected = NullPointerException.class)
    public void testUnionNull(){
        sortedArrayUnionandIntersection.getUnion(null,null);
    }

    @Test(expected = NullPointerException.class)
    public void testUnionEmpty(){
        int[] a = {};
        int[] b = {};
        sortedArrayUnionandIntersection.getUnion(a,b);
    }

    @Test
    public void testUnionValidCase1(){
        int[] a = {1,3,4,5,7};
        int[] b = {2,3,5,6};
        int[] expected = {1,2,3,4,5,6,7};
        int[] result = sortedArrayUnionandIntersection.getUnion(a,b);
        assertArrayEquals(expected,result);

    }

    @Test
    public void testUnionValidCase2(){
        int[] a = {2,5,6};
        int[] b = {4,6,8,10};
        int[] expected = {2,4,5,6,8,10};
        int[] result = sortedArrayUnionandIntersection.getUnion(a,b);
        assertArrayEquals(expected,result);

    }

    @Test(expected = NullPointerException.class)
    public void testIntersectionNull(){
        sortedArrayUnionandIntersection.getIntersection(null,null);
    }

    @Test(expected = NullPointerException.class)
    public void testIntersectionEmpty(){
        int[] a = {};
        int[] b = {};
        sortedArrayUnionandIntersection.getIntersection(a,b);
    }

    @Test
    public void testIntersectionValidCase1(){
        int[] a = {1,3,4,5,7};
        int[] b = {2,3,5,6};
        int[] expected = {3,5};
        int[] result = sortedArrayUnionandIntersection.getIntersection(a,b);
        assertArrayEquals(expected,result);
    }

    @Test
    public void testIntersectionValidCase2(){
        int[] a = {2,5,6};
        int[] b = {4,6,8,10};
        int[] expected = {6};
        int[] result = sortedArrayUnionandIntersection.getIntersection(a,b);
        assertArrayEquals(expected,result);
    }
}
