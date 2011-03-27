import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeTest {
	@Test
	public void testOne() {
		assertEquals(list(), PrimeNumbers.generatePrimes(1));
	}
	
	public void testTwo() {
		assertEquals(list(2), PrimeNumbers.generatePrimes(2));
	}
	
	public ArrayList<Integer> list(int... values) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int index : values) {
			list.add(index);
		}
		
		return list;
	}
}
