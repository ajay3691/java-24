package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIEx {

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
		
		enames.stream()
		      .filter(name->name.startsWith("r"))
			  .forEach(name->System.out.println(name));	

	}

}
