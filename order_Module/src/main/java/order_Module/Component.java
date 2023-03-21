package order_Module;

import java.util.ResourceBundle;

public class Component {

		public int user_Login() {
			ResourceBundle rs=ResourceBundle.getBundle("config");
			String ename = rs.getString("username");
			String epass =rs.getString("password");
			System.out.println(ename);
		return 1;
		}
		public static void main(String[] args) {
			Component c = new Component();
			c.user_Login();
		}
		
}
