package ServiceImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import Service.UserService;
import bean.User;
import db.DbConnection;

public class UserServiceImp implements UserService {
	//从数据库里取数据要用db里的一个查询方法！
	DbConnection db = new DbConnection();
	
	//取数据先要放到这个里头 利用db查询得到的是一个resultset结果集
	ResultSet rs = null;
	
	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		boolean bl = false;
		String strSql = "select * from user_table where userName=N'"+user.getUserName()+"'";
		rs = db.executeQuery(strSql);
		System.out.println(user.getUserName());
		
		try {
			while(rs.next()) {
				bl=true;
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//bl为真就是有重复的用户
		return bl;
	}

}
