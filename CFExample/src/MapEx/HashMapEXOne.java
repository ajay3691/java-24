package MapEx;

import java.util.HashMap;

public class HashMapEXOne {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		System.out.println(hm);//empty hashmp object
		hm.put(101, "Rahul");
		hm.put(102, "Sonia");
		hm.put(103, "Priyanka");
		hm.put(103, "Priyanka Vadra");
		System.out.println(hm);
	}

}
