package tw.sean.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC03 {

	public static void main(String[] args) {

	
		
		String url3 = "jdbc:mysql://127.0.0.1:3306/brad";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(url3,prop)){
			
			Statement st =conn.createStatement();
			String sql = "UPDATE cust SET tel = '666' WHERE id = 8 ";
			
			int n =st.executeUpdate(sql);
			System.out.println(n);
			
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
