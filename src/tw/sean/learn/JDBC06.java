package tw.sean.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class JDBC06 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "123456");
		
		String url = "jdbc:mysql://127.0.0.1:3306/brad";
		
		try {
			Connection conn = DriverManager.getConnection(url,prop);
			String sql = "SELECT * FROM gift ORDER BY city";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			
//			System.out.println(rs.getRow());
//			rs.next();
//			System.out.println(rs.getRow());
//			
//			int id = rs.getInt("id"); //用欄位名稱抓
//			System.out.println(id);
//			String name = rs.getString("name");
//			System.out.println(name);
//			
//			System.out.println("------------");
//			
//			rs.next();
//			System.out.println(rs.getRow());
//			
//			id = rs.getInt("id"); //用欄位名稱抓
//			System.out.println(id);
//			name = rs.getString("name");
//			System.out.println(name);
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String city = rs.getString("city");
				System.out.printf("%s,%s,%s\n",id,name,city);
			}
			
			
			
			  
			


			
		} catch (SQLException e) {
			System.out.println(e);;
		}

	}

}
