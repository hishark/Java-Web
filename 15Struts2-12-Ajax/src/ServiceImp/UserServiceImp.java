package ServiceImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import Service.UserService;
import bean.User;
import db.DbConnection;

public class UserServiceImp implements UserService {
	//�����ݿ���ȡ����Ҫ��db���һ����ѯ������
	DbConnection db = new DbConnection();
	
	//ȡ������Ҫ�ŵ������ͷ ����db��ѯ�õ�����һ��resultset�����
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
		//blΪ��������ظ����û�
		return bl;
	}

}
