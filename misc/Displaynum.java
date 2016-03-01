
public class Displaynum {

	public static void main(String[] args) 
	{
		java.util.Scanner scn = new java.util.Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		for(int i=0;i<=n;i++)
		{
			sum = sum + i;
			System.out.println(i);
		}
		System.out.println(sum);

	}

}
