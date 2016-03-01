/**
 * 
 */

/**
 * @author chithra
 *
 */
public class TestExample {

	/**
	 * @param args
	 */
	public int sumofPrimes (int n) {
		System.out.println("this is a test to learn Java");
		int sum = 3;
		for(int j=5; j<n; j++){
			if (isPrime(j)) {
				sum = sum+j;
			}
		}
		// TODO Auto-generated method stub
		return sum;

	}
	public boolean isPrime(int n) {
		if (n % 2 == 0) {
			return false;
		}
		for (int j=3; j< (n/2); j=j+2) {
			if(n % j == 0){
				return false;
			}
		}
		return true;
	}

}
