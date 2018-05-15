import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxSumNoAdjacentTest {

    MaxSumNoAdjacent maxSumNoAdjacent;

    @Before
    public void setup(){
        maxSumNoAdjacent = new MaxSumNoAdjacent();
    }


    @Test(expected = NullPointerException.class)
    public void testNull(){
        maxSumNoAdjacent.getMax(null);
    }

    @Test(expected = NullPointerException.class)
    public void testEmpty(){
        int[] a = {};
        maxSumNoAdjacent.getMax(a);
    }

    @Test
    public void validCase1(){
        int[] a = {3,2,7,10};
        int sum = maxSumNoAdjacent.getMax(a);
        assertEquals(13,sum);
    }

    @Test
    public void validCase2(){
        int[] a = {5,5,10,40,50,35};
        int sum = maxSumNoAdjacent.getMax(a);
        assertEquals(80,sum);
    }
}
