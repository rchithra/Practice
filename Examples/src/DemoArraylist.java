import java.util.ArrayList;
public class DemoArraylist {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println("1st element: " +a.get(0));
		System.out.println(a);
		a.add(1, 40);
		System.out.println(a);
		a.add(2, 50);
		System.out.println(a);
		System.out.println("Size: "+a.size());
		a.remove(0);
		System.out.println(a);
		a.remove(new Integer(50));
		System.out.println(a);
		a.clear();
		System.out.println(a);
		

	}

}
