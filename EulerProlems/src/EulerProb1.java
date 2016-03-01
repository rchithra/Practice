
public class EulerProb1 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for( i= 0; i<1000; i++)
		{
			if ((i%3==0) || (i%5==0))
			{
				sum = sum + i;	
			}
		}
		System.out.println("Sum of multiples of 3 and 5 below 1000 are: " + sum);

	}

}
