package db;

import java.sql.*;

/*
 * 这是一个工具类
 */
public class DbConnection {
	private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	/*
	 * 想要访问哪台服务器上的数据库以及数据库名字是什么。 1433端口是SQL Server默认的端口，SQL
	 * Server服务使用两个端口：TCP-1433、UDP-1434。 其中1433用于供SQL Server对外提供服务，1434用于向请求者返回SQL
	 * Server使用了哪个TCP/IP端口。
	 */
	private String url = "jdbc:sqlserver://localhost:1433;DatabaseName=777Database";
	private String userName = "sa";
	private String passWord = "123";
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	public static void main(String strs[]) {
		DbConnection dc = new DbConnection();
		String sql = "insert into book_table values('002','haha','55.5')";
		dc.executeUpdate(sql);
	}

	/*
	 * 加载驱动程序 写个构造函数
	 */
	public DbConnection() {
		/*
		 * 第一步 加载驱动程序
		 */
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 只接受增删改的sql语句
	 */
	public int executeUpdate(String sql) {
		int result = 0;
		/*
		 * 第二步 创建连接
		 */
		try {
			conn = DriverManager.getConnection(url, userName, passWord);
			/*
			 * 第三步 创建statement
			 */
			stmt = conn.createStatement();
			/*
			 * 第四步 执行sql语句
			 */
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	/*
	 * 查询 得到一个结果集
	 */
	public ResultSet executeQuery(String sql) {

		try {
			conn = DriverManager.getConnection(url, userName, passWord);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	/*
	 * 连接用完记得要关闭 太多了会崩溃
	 */
	public boolean closeConnection(Connection conn) {
		boolean bl = false;
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bl = true;
		} else {
			bl = true;
		}
		return bl;
	}
}
