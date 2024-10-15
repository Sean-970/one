package tw.sean.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC01 {

	public static void main(String[] args) {

		String url1 = "jdbc:mysql://127.0.0.1:3306/brad?user=root&password=root"; 
//		try(Connection conn = DriverManager.getConnection(url1)){
//			System.out.println("ok2");
//		} catch (SQLException e) {
//			System.out.println(e);
//		}
		
		String url2 = "jdbc:mysql://127.0.0.1:3306/brad"; 
//		try(Connection conn = DriverManager.getConnection(url2,"root","root")){
//			System.out.println("ok3");
//		} catch (SQLException e) {
//			System.out.println(e);
//		}
		
		String url3 = "jdbc:mysql://127.0.0.1:3306/brad";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(url3,prop)){
			System.out.println("ok4");
			Statement st =conn.createStatement();
			String sql = "INSERT INTO cust (name,tel,birthday) VALUES ('brad','123','1999-09-09') ";
			sql += ",('Ian','1234','1999-09-09')";
			sql += ",('Sean','4321','1999-09-09')";
			int n =st.executeUpdate(sql);
			System.out.println(n);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
