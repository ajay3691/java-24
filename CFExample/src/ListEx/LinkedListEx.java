package ListEx;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Integer> ids = new LinkedList<Integer>();
		ids.add(102);
		ids.add(103);
		ids.add(104);
		ids.add(105);
		System.out.println(ids);
		ids.addFirst(101);
		System.out.println(ids);
		/*
		for(int i=0; i<=ids.size()-1;i++) {
			System.out.println(ids.get(i));
		}
		*/
		/*for(int id:ids) {
			System.out.println(id);
		}
		*/
		Iterator i=ids.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
