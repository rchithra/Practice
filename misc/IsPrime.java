import java.util.*;
public class IsPrime {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 1;
		for(int i = 2; i<n; i++)
		{
			if (n%i == 0)
			{
				a = 0;
				break;
			}
		}	
		if(a == 1)
		{
			System.out.println("Number "+n+ " is Prime ");
		}
		else
		{
			System.out.println("Number " +n+ " is not Prime");
		}
		
		
	}

}
