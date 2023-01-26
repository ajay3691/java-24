package SetEx;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExThree {
	public static void main(String[] args) {
		HashSet hs = new HashSet(100,0.5f);
		hs.add(108);
		hs.add(103);
		hs.add(105);
		hs.add(107);
		hs.add(103);
		Collections.sort(hs);
		
	}
}
