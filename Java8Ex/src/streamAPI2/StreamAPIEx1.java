package streamAPI2;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIEx1 {
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
		
		//print employee names , those are names start with 's'
		for(int i=0; i<=empList.size()-1;i++) {
			if(true) {
				System.out.println(empList.get(i).geteName());
			}
		}
	}
}
