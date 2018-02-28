package jxnu.edu.cn.x3321.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	//和jsp的变量名一致
	//其实不要一致 
	//可以不一样 但是getset方法里的变量名要一样
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//自动调用这个方法
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("姓名"+username+"密码"+password);
		
		//return到structs.xml中
		return "loginSucc";
		
		//return super.execute();
	}
	
}
