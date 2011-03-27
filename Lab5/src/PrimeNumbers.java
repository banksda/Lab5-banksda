import java.util.ArrayList;


public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(n > 1) {
			list.add(2);
		}
		
		return list;
	}
}
