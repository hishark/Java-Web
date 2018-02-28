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

	//自动调用这个方法
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("姓名"+user.getUserName()+"密码"+user.getPassWord());
		//return到structs.xml中
		return "loginSucc";
		
		//return super.execute();
	}
	
}
