import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeNumberTest {

    PrimeNumber primeNumber;

    @Before
    public void setup(){
        primeNumber = new PrimeNumber();
    }

    @Test
    public void testListAllPrime(){
       List<Integer> result = primeNumber.getAllPrimes(150);
       Integer expected = 149;
        assertEquals(expected,result.get(result.size()-1));
    }

}
