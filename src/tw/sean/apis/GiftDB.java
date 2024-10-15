package tw.sean.apis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.Query;

public class GiftDB {
	private static final String USER = "root";
	private static final String PASSWD = "root";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/brad";
	private static final String SQL_QUERY ="SELECT * FROM gift";
	
	private Connection conn;
	private ResultSet rs;
	private String[] fields;
	
	public GiftDB() throws Exception {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		
		conn = DriverManager.getConnection(URL,prop);
	}
	
	public void query() throws SQLException  {
		query(SQL_QUERY);
	}
	public void query(String sql) throws SQLException {
		Statement stmt =  conn.createStatement(
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
					rs = stmt.executeQuery(sql);
					
					ResultSetMetaData rsmd = rs.getMetaData();
					fields = new String[rsmd.getColumnCount()];
					for(int i=0;i<rsmd.getColumnCount();i++) {
						fields[i] = rsmd.getColumnLabel(i+1); 
						System.out.println(fields[i]);
					}
					
	}
	
	public int getRows() {
		try {
			rs.last();
			return rs.getRow() ;
		} catch (SQLException e) {
			return 0;
		}
		
	}
	
	public int getCols() {
		return fields.length ;
	}
	
	public String getData(int row,int col) {
		try {
		rs.absolute(row+1);
		return rs.getString(fields[col]);
		
		}catch(Exception e) {
			return "error";
		}
	}
	
	public String[] getFieldNames() {
		return fields;
	}
	
	public void delData(int row) throws SQLException {
		rs.absolute(row+1);
		rs.deleteRow();
	}
	
	public void updateData(String newdata,int row,int col) {
		try {
			rs.absolute(row+1);
			rs.updateString(col+1, newdata);
			rs.updateRow();
		} catch (SQLException e) {
			System.out.println(e);
			
		}
	}
		
		
		
	
}
