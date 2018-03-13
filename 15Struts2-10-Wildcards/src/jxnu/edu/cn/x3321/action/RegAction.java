package jxnu.edu.cn.x3321.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
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
		 * 把数据存到session
		 */
		Map<String,Object> session = ActionContext.getContext().getSession();
		session.put("userName", user.getUserName());
		//session跟着用户走啦
		System.out.println(user.getUserName());
		return str;
	}
}
