package ListEx;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("Rahul");
		al2.add("Sonia");
		al2.add("Priyanka");
		al2.add("Modi");
		al2.add("Shaw");
		System.out.println(al1); //[]
		System.out.println(al2); //[.....]
		System.out.println(al2.size());//5
		System.out.println(al2.contains("Sonia"));//true
		System.out.println(al2.isEmpty()); //false
		System.out.println(al2.get(1));
	}

}
