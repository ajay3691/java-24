package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIEx3 {

	public static void main(String[] args) {
		List<String> enames=new ArrayList<>();
		enames.add("rahul");
		
		enames.add("sonia");
		enames.add("priyanka");
		enames.add("modi");
		enames.add("rajeev");
		enames.add("india");
		enames.add("rahul");
		enames.add("amith");
		enames.add("kk");
		enames.add("nikhil");
		//create stream object using stream() method
		//create new emp list object based name start with r
		
		List<String>  new_Names=enames.stream()
		      .filter(name->name.startsWith("r"))
		      .map(name -> name.toUpperCase())
		      .collect(Collectors.toList());
		System.out.println(new_Names);

	}

}
