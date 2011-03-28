import java.util.ArrayList;


public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(n % 3 == 0) {
			list.addAll(generatePrimes(n/3));
			list.add(3);
		}
		else if (n % 2 == 0) {
			list.addAll(generatePrimes(n/2));
			list.add(2);
		}
		
		
		return list;
	}
}
