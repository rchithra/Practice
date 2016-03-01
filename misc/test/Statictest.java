package test;

public class Statictest {
	int i = 1001;
	static{
		System.out.println("this is static block in test");
	}
	public final void display() {
		System.out.println("This is void. Value of i is "+i);
	}

}
