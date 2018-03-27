package jxnu.edu.cn.x3321.serviceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import jxnu.edu.cn.x3321.bean.User;
import jxnu.edu.cn.x3321.db.DbConnection;
import jxnu.edu.cn.x3321.service.UserService;

public class UserServiceImpl implements UserService {
	DbConnection  db=new DbConnection();
	ResultSet rs=null;

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		boolean bl=false;
		String strSql="select * from user_table where userName='"+user.getUserName()+"'";
		rs=db.executeQuery(strSql);
		try {
			while(rs.next()){
				bl=true;
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bl;
	}

	@Override
	public boolean loginCheck(String userName, String passWord) {
		// TODO Auto-generated method stub
		boolean bl=false;
		//这样子写会受到sql注入攻击 这就是sql的漏洞 有userName就可以进入了
		//应该要先判断有没有这个名字，有名字再判断密码对错
		
		String strSql="select * from user_table where userName='"+userName+"'";
		
		rs=db.executeQuery(strSql);
		try {
			while(rs.next()){
				bl=true;
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bl;
	}

}
