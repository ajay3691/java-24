package MapEx;

import java.util.HashMap;

public class HashMapEXTwo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "Rahul");
		hm.put(102, "Sonia");
		hm.put(103, "Priyanka");
		hm.put(103, "Priyanka Vadra");
		//System.out.println(hm.size());
		//System.out.println(hm.values());
		//System.out.println(hm.keySet());
		//System.out.println(hm.entrySet());
		
		/*for(Object value:hm.values()) {
			System.out.println(value);
		}*/
		/*for(Object key:hm.keySet()) {
			System.out.println(key);
		}*/
		for(Object kv:hm.entrySet()) {
			System.out.println(kv);
		}
	}

}
