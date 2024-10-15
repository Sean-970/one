package tw.sean.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC04 {

	public static void main(String[] args) {

	
		
		String url3 = "jdbc:mysql://127.0.0.1:3306/brad";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "123456");
		
		try(Connection conn = DriverManager.getConnection(url3,prop)){
			String name = "AmYYYYYYYYY";
			String tel = "123456";
			String birthday = "1999-03-04";
			int id = 2;
			String sql = "UPDATE cust SET name = ?,tel = ?,birthday = ? WHERE id = ?";
			PreparedStatement pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(3, birthday);
			pstmt.setInt(4, id);
			
			pstmt.executeUpdate();
			System.out.println("ok");
			
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
