package tw.sean.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBC05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name:");
		String name = sc.next();
		System.out.print("Tel:");
		String tel = sc.next();
		System.out.print("Birthday:");
		String birthday = sc.next();
	
		
		String url3 = "jdbc:mysql://127.0.0.1:3306/brad";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(url3,prop)){
			String sql ="INSERT INTO cust (name,tel,birthday) VALUES(?,?,?)"; 
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(3, birthday);
			if(pstmt.executeUpdate()>0) {
				System.out.println("Success");
			}
			
			
			
			
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
