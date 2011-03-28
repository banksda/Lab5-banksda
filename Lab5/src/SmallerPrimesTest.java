import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class SmallerPrimesTest {
	@Test
	public void testTwo() {
		assertEquals(list(), PrimeNumbers.determineSmallerPrimes(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(list(2), PrimeNumbers.determineSmallerPrimes(3));
	}
	
	public ArrayList<Integer> list(int... values) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		for(int index : values) {
			list.add(index);
		}
	
		return list;
	}
}
