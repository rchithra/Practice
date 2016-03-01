package test;

public class TestRun {
	public static void main(String[] args) {
		System.out.println("main starts");
		{
			Statictest s = new Statictest();
			s = null;
		}
		System.out.println("This is after first initialization");
		Statictest s1 = new Statictest();
		
		Testout t = new Testout();
		t.displayI();
		t.display();
	}
}
