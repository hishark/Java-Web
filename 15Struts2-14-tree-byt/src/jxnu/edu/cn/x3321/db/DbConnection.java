package jxnu.edu.cn.x3321.db;

import java.sql.*;

public class DbConnection {
	private String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String url="jdbc:sqlserver://localhost:1433;DatabaseName=15database";
	private String userName="sa";
	private String passWord="";
	private Connection conn=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	
	
	public static void main(String strs[]){
		DbConnection dc=new DbConnection();
		String sql="insert into book_table values('003','jsp','32.5')";
		dc.executeUpdate(sql);
	}
	
	public DbConnection(){
		//第一步加载驱动程序
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int executeUpdate(String sql){
		int result=0;
		//第二步 创建连接
		try {
			conn=DriverManager.getConnection(url,userName,passWord);
			//第三步创建statement
			stmt=conn.createStatement();
			//第四步执行sql
			result=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public ResultSet executeQuery(String sql){
		//第二步 创建连接
		try {
			conn=DriverManager.getConnection(url,userName,passWord);
			//第三步创建statement
			stmt=conn.createStatement();
			//第四步执行sql
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
