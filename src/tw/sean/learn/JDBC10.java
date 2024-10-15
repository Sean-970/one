package tw.sean.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import org.mindrot.BCrypt;

public class JDBC10 {
	static Connection conn;
	public static void main(String[] args) {
		System.out.println("Register....");
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		String url = "jdbc:mysql://127.0.0.1:3306/member";
		
		try {
			conn = DriverManager.getConnection(url, prop);
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.print("Account: ");
			String account = scanner.next();
			System.out.print("Password: ");
			String passwd = scanner.next();
			System.out.print("Name: ");
			String name = scanner.next();
			
			String sql = "SELECT * FROM member WHERE account = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				String hashpasswd = rs.getString("password");
				if(BCrypt.checkpw(passwd, hashpasswd)) {
					System.out.println("Login Success");
					System.out.printf("Welcome,%s",rs.getString("name"));
				}else {
					System.out.println("Login Failure(1)");
				}
			}else {
				System.out.println("Login Failure(2)");
			}
			
			
			
			
			
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
