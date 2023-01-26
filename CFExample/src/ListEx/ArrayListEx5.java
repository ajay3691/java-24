package ListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx5 {

	public static void main(String[] args) {
		
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("Rahul");
		al2.add("Sonia");
		al2.add("Priyanka");
		al2.add("Modi");
		System.out.println(al2);
		Collections.sort(al2, Collections.reverseOrder());
		System.out.println(al2);
		
		
		
		
	}

}
