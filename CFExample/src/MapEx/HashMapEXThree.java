package MapEx;

import java.util.HashMap;

public class HashMapEXThree {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "Rahul");
		hm.put(102, "Sonia");
		hm.put(103, "Priyanka");
		hm.put(103, "Priyanka Vadra");
		System.out.println(hm.containsKey(103));
		System.out.println(hm.containsKey(109));
		System.out.println(hm.containsValue("Sonia"));
	}

}
