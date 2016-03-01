
public class Account 
{
	int accNo;
	float bal;
	static String bank = "ICICI";
	Account(int n, float f) {
		this.accNo = n;
		this.bal = f;
	}
	void getBal()
	{
		System.out.println("Current balance: "+bal+" Rs" );
	}
	
	void withDraw(int amt)
	{
		if(bal>=amt)
		{
			bal-=amt;
			System.out.println("Collect your cash");
		}
		else{
			System.out.println("Error! Insufficient balance");
		}
	}
	void displayAcc() {
		System.out.println("The account number is "+this.accNo);
	}
}
