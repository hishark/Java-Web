package jxnu.edu.cn.x3321.action;

import com.opensymphony.xwork2.ActionSupport;

import bean.User;

public class RegAction extends ActionSupport {

	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	/*
	 * 定义一个注册的方法
	 */
	public String reg() {
		String str="regSucc";
		/*
		 * 调用业务逻辑把user写到数据库
		 */
		System.out.println(user.getUserName());
		return str;
	}
}
