package SetEx;

import java.util.HashSet;

public class HashSetExOne {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		//default fill ratio/ Load Factor: 0.75f
		//initila capacity: 16
		
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(20);
		System.out.println(hs);
	}
}
