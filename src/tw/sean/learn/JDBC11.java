package tw.sean.learn;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class JDBC11 {
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/member";
	private static final String SQL_DATE = "UPDATE MEMBER SET icon = ? where id = ?";
	
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try {
			Connection conn = DriverManager.getConnection(URL,prop);
			PreparedStatement pstmt = conn.prepareStatement(SQL_DATE);
			FileInputStream fin = new FileInputStream("dir2/ball0.png");
			pstmt.setBinaryStream(1,fin);
			pstmt.setInt(2, 1);
			if(pstmt.executeUpdate()>0) {
				System.out.println("ok");
			}else {
				System.out.println("xx");
			}
			
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
