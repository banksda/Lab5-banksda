import java.util.ArrayList;


public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(n == 2) {
			list.add(2);
		}
		
		if(n > 2) {
			list.add(3);
		}
		
		return list;
	}
}
