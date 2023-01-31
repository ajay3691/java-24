package MapEx;

import java.util.HashMap;

public class HashMapFour {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "Rahul");
		hm.put(102, "Sonia");
		hm.put(103, "Priyanka");
		//System.out.println(hm.get(102); // key exist return value
		//System.out.println(hm.get(109));//key not exist return null
		for(Object key:hm.keySet()) {
			System.out.println(hm.get(key));
		}
	}

}
