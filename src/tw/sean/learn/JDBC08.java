package tw.sean.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;


public class JDBC08 {

	public static void main(String[] args) {
		
		int rpp = 5; //一頁10筆
		
		System.out.println("頁:  ");
		Scanner sc = new Scanner(System.in);
		int page = sc.nextInt();
		int start = (page-1)*rpp;
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "123456");
		
		String url = "jdbc:mysql://127.0.0.1:3306/brad";
		
		try {
			Connection conn = DriverManager.getConnection(url,prop);
			String sql = "SELECT * FROM gift ORDER BY id LIMIT ?,?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, rpp);
			ResultSet rs =  pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String city = rs.getString("city");
				
				System.out.printf("%s:%s:%s\n",id,name,city);
			}
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			System.out.println(e);;
		}
		
	}
	
}
			

			
