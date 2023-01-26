package ListEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("Rahul");
		al2.add("Sonia");
		al2.add("Priyanka");
		al2.add("Modi");
		al2.add("Shaw");
		al2.add("Priyanka");
		al2.add("Modi");
		al2.add("Shaw");
		
		/*for(String name:al2) {
			System.out.println(name);
		}*/
		/*for(int i=0;i<=al2.size()-1;i++) {
			System.out.println(al2.get(i));
		}*/
		Iterator 	i=al2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
