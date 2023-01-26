package ListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx4 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(100);
		al1.add(10.5);
		
		al1.add(true);
		System.out.println(al1);
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("Rahul");
		al2.add("Sonia");
		al2.add("Priyanka");
		al2.add("Modi");
		System.out.println(al2);
		List al3=new ArrayList();
		al3.addAll(al1);
		al3.addAll(al2);
		System.out.println(al3);
		
		
	}

}
