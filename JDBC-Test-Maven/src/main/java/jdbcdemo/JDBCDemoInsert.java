package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemoInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/7pm","root","root");
			Statement st=con.createStatement();
			st.executeUpdate("create table emp99(id int, name varchar(32))");
			System.out.println("Table Created");
			con.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	

	}

}
