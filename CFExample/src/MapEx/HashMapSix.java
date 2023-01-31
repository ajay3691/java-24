package MapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSix {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "Rahul");
		hm.put(102, "Sonia");
		hm.put(103, "Priyanka");
		System.out.println(hm.entrySet());
		Iterator itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry entry=(Entry) itr.next();
			System.out.println("Employee Id:"+entry.getKey()+"and Employee Name:"+entry.getValue());
		}
		
	}

}
