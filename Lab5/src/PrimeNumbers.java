import java.util.ArrayList;


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
		
		if (value < 3)
			return list;
		else if(value == 3)
			list.add(2);
				
		return list;
	}
}
