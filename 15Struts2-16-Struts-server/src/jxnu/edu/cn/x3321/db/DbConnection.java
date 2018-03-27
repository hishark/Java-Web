package jxnu.edu.cn.x3321.db;

import java.sql.*;

public class DbConnection {
	private String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String url="jdbc:sqlserver://localhost:1433;DatabaseName=777Database";
	private String userName="sa";
	private String passWord="123";
	private Connection conn=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	
	
	public static void main(String strs[]){
		DbConnection dc=new DbConnection();
		String sql="insert into book_table values('003','jsp','32.5')";
		dc.executeUpdate(sql);
	}
	
	public DbConnection(){
		//绗竴姝ュ姞杞介┍鍔ㄧ▼搴�
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int executeUpdate(String sql){
		int result=0;
		//绗簩姝� 鍒涘缓杩炴帴
		try {
			conn=DriverManager.getConnection(url,userName,passWord);
			//绗笁姝ュ垱寤簊tatement
			stmt=conn.createStatement();
			//绗洓姝ユ墽琛宻ql
			result=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public ResultSet executeQuery(String sql){
		//绗簩姝� 鍒涘缓杩炴帴
		try {
			conn=DriverManager.getConnection(url,userName,passWord);
			//绗笁姝ュ垱寤簊tatement
			stmt=conn.createStatement();
			//绗洓姝ユ墽琛宻ql
			rs=stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public boolean coloseConnection(Connection conn){
		boolean bl=false;
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bl=true;
		}else{
			bl=true;
		}
		return bl;
	}
	

}
