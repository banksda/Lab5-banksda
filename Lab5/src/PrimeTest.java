import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeTest {
	@Test
	public void testOne() {
		assertEquals(new ArrayList<Integer>(), PrimeNumbers.generatePrimes(1));
	}
}
