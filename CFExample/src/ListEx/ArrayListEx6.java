package ListEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		al2.add(108);
		al2.add(200);
		al2.add(23);
		al2.add(18);
		
		System.out.println(al2);
		Collections.sort(al2, Collections.reverseOrder());
		//Collections.sort(al2, Collections.reverseOrder());
		System.out.println(al2);
		
		
		
		
	}

}
