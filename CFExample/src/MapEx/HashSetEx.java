package MapEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
public static void main(String[] args) {
	HashSet set =new HashSet();
	set.add(101);
	set.add(102);
	set.add(103);
	System.out.println(set);
	
	/*for(Object element:set) {
		System.out.println(element);
	}*/
	
	Iterator itr=set.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
