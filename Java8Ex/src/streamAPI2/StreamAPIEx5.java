package streamAPI2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIEx5 {
	public static void main(String[] args) {
	
		List<Employee> empList= new ArrayList<>();
		empList.add(new Employee(101, "rahul", 45000));
		empList.add(new Employee(102, "sonia", 45000));
		empList.add(new Employee(103, "kajal", 45000));
		empList.add(new Employee(104, "sagar", 45000));
		empList.add(new Employee(105, "devika", 45000));
		empList.add(new Employee(106, "chirag", 45000));
		empList.add(new Employee(107, "latha", 45000));
		empList.add(new Employee(108, "muni", 45000));
		empList.add(new Employee(109, "darshan", 45000));
		empList.add(new Employee(110, "vranjith", 45000));
		
		//print employee names ,  and transform into upper case
		List<String> new_List= empList.stream().map(emp->emp.geteName().toUpperCase())
						.collect(Collectors.toList());
		
		new_List.forEach(e->System.out.println(e));
		           
	}
	
	
}
