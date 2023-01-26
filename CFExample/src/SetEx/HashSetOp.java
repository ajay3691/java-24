package SetEx;

import java.util.HashSet;

public class HashSetOp {

	public static void main(String[] args) {
	HashSet set1=new HashSet();
	HashSet set2=new HashSet();
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	set1.add(5);
	set2.add(3);
	set2.add(4);
	set2.add(5);
	set2.add(6);
	set2.add(7);
	System.out.println(set1);
	System.out.println(set2);
	//set1.addAll(set2); //union operation
	//set1.retainAll(set2);//Difffernce
	//set1.removeAll(set2);
	set2.removeAll(set1);
	//System.out.println(set1);
	System.out.println(set2);
	
	
	}

}
