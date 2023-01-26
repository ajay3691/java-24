package SetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExOne2 {
	public static void main(String[] args) {
		HashSet hs = new HashSet(100,0.5f);
		hs.add(10);
		hs.add("twenty");
		hs.add(true);
		hs.add(null);
		System.out.println(hs);
		/*
		for(Object obj:hs) {
			System.out.println(obj);
		}*/
		
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
