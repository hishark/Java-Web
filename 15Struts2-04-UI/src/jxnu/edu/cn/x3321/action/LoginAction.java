package jxnu.edu.cn.x3321.action;

import com.opensymphony.xwork2.ActionSupport;

import bean.User;

public class LoginAction extends ActionSupport {
	
	User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	//�Զ������������
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("����"+user.getUserName()+"����"+user.getPassWord());
		//return��structs.xml��
		return "loginSucc";
		
		//return super.execute();
	}
	
}
