
public class Fibnocciexp {

	public static void main(String[] args)
	{
		java.util.Scanner scn = new java.util.Scanner(System.in);
		int n = scn.nextInt();
		int n1=0;
		System.out.println(n1);
		int n2 =1;
		System.out.println(n2);
		int n3;
		for(int i=1;i<=n;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}

}
