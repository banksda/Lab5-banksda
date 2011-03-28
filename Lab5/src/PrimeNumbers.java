import java.util.ArrayList;
import java.util.BitSet;


public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int value = 2; n > 1; value++) {
			while(n % value == 0) {
				list.add(value);
				n /= value;
			}
		}
	
		return list;
	}
	
	public static ArrayList<Integer> determineSmallerPrimes(int value) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		BitSet primes = new BitSet();
		
		primes.set(0, false);
		primes.set(1, false);
		primes.set(2, value, true);
		
		for (int outer = 0; outer * outer < value; outer++)
		{
			if (primes.get(outer))
			{
				for (int inner = outer * outer; inner < value; inner += outer)
				{
					primes.clear(inner);
				}
			}
		}
		
		for(int i = 2; i < value; i++) {
			if(primes.get(i)) {
				list.add(i);
			}
		}
	    return list;
	}
}
