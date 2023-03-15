package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemoOne {

	public static void main(String[] args) {

		try {
			//load required driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection using DriverManager
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbone","root","root");
			
			Statement st = con.createStatement();
			st.executeUpdate("create table emp1(eid int, ename varchar(30), esal int)");
			System.out.println("Table created Successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
