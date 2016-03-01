import java.util.*;
public class Atm {
	
	int n;
	Atm(int n){
		this.n = n;
	}

	public static void main(String[] args) 
	{
		Account a1 = new Account(12345,2000);
		a1.displayAcc();
		
	}
	
	void test() {
		System.out.println("This should be public");
		System.out.println("The number of this atm is "+this.n);
	}

}
