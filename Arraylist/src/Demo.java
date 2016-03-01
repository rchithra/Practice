import java.util.Iterator;
import java.util.ArrayList;
public class Demo {

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String> ();
		a.add("Chithra");
		a.add("Karthik");
		Iterator<String> itr = a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().charAt(0));
		}	
		
	}

}
