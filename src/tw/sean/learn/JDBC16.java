package tw.sean.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.mysql.cj.xdevapi.Result;

public class JDBC16 {
	private static final String USER = "root";
	private static final String PASSWD = "123456";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/brad";
	private static final String SQL_QUERY ="SELECT * FROM gift";

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try {
			Connection conn = DriverManager.getConnection(URL,prop);
			PreparedStatement pstmt = conn.prepareStatement(SQL_QUERY,
					                                        ResultSet.TYPE_SCROLL_INSENSITIVE,
					                                        ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.printf(" %s : %s \n",id,name);
			}
			System.out.println("------------------------------");
			if(rs.first()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.printf(" %s : %s \n",id,name);
			}
			
			System.out.println("------------------------------");
			if(rs.absolute(49)) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.printf(" %s : %s \n",id,name);
			}
			
			rs.updateString("name", "古意李");
			rs.updateString("town", "田頭陣");
			rs.updateRow();
			System.out.println("------------------------------");
			
			String id = rs.getString("id");
			String name = rs.getString("name");
			System.out.printf(" %s : %s \n",id,name);
			
			System.out.println("------------------------------");
			
//			rs.deleteRow(); //砍掉往上一筆
			
		    id = rs.getString("id");
		    name = rs.getString("name");
			System.out.printf(" %s : %s \n",id,name);
			
			System.out.println("------------------------------");
			rs.moveToInsertRow();
			rs.updateString("name", "古意李");
			rs.updateString("feature", " ");
			rs.updateString("addr", " ");
			rs.updateString("picurl", " ");
			rs.updateString("city", " ");
			rs.updateString("town", "田頭陣");
			rs.updateDouble("lat", 0.0);
			rs.updateDouble("lng", 0.0);
			
		
			
		}catch(Exception e ){
			System.out.println(e);
		}
	}

}
