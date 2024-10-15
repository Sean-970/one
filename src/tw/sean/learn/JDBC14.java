package tw.sean.learn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBC14 {
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/member";
	private static final String SQL_QUERY = "SELECT * FROM member where id = ?";

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		try {
			Connection conn = DriverManager.getConnection(URL,prop);
			PreparedStatement pstmt = conn.prepareStatement(SQL_QUERY);
			pstmt.setInt(1, 1);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				String account = rs.getString("account");
				InputStream in =  rs.getBinaryStream("icon");
				
				new Thread() {
					public void run() {
						try {
							
							String filename = String.format("dir3/%s.png", account);
							FileOutputStream fout = new FileOutputStream(filename);
							byte[] buf =  new byte[64*1024];
							int len = in.read(buf);
							fout.write(buf,0,len);
							fout.flush();
							fout.close();
							System.out.println("Save ok");
						}catch(Exception e) {
							System.out.println(e);
						}
					}
				}.start();
				
				System.out.println("Main Finsh");
				
				
			}else {
				System.out.println("id not exist");
			}
			
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
