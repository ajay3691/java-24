package MapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapFive {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "Rahul");
		hm.put(102, "Sonia");
		hm.put(103, "Priyanka");
		System.out.println(hm);
		hm.remove(102);
		System.out.println(hm);
		hm.clear();
		System.out.println(hm);
	}

}
