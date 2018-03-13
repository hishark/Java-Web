package db;

import java.sql.*;

/*
 * ����һ��������
 */
public class DbConnection {
	private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	/*
	 * ��Ҫ������̨�������ϵ����ݿ��Լ����ݿ�������ʲô�� 1433�˿���SQL ServerĬ�ϵĶ˿ڣ�SQL
	 * Server����ʹ�������˿ڣ�TCP-1433��UDP-1434�� ����1433���ڹ�SQL Server�����ṩ����1434�����������߷���SQL
	 * Serverʹ�����ĸ�TCP/IP�˿ڡ�
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
	 * ������������ д�����캯��
	 */
	public DbConnection() {
		/*
		 * ��һ�� ������������
		 */
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * ֻ������ɾ�ĵ�sql���
	 */
	public int executeUpdate(String sql) {
		int result = 0;
		/*
		 * �ڶ��� ��������
		 */
		try {
			conn = DriverManager.getConnection(url, userName, passWord);
			/*
			 * ������ ����statement
			 */
			stmt = conn.createStatement();
			/*
			 * ���Ĳ� ִ��sql���
			 */
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	/*
	 * ��ѯ �õ�һ�������
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
	 * ��������ǵ�Ҫ�ر� ̫���˻����
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
