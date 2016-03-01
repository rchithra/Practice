
public class Factorial {

	public static void main(String[] args)
	{
		java.util.Scanner scn = new java.util.Scanner(System.in);
		int n = scn.nextInt();
		if (n<0){ System.out.println("Negative numbers are not valid");};
		int fact = 1;
		for (int i = 1; i<= n;i++)
		{
			fact = fact * i;
			System.out.println(fact);
		}
		System.out.println("Factorial of " +n +" is "+ fact);
	}

}
