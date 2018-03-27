package jxnu.edu.cn.x3321.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import Service.UserService;
import ServiceImp.UserServiceImp;
import bean.User;

public class RegAction extends ActionSupport {

	User user;
	
	//放结果的字符串 返回到ajaxresult.jsp里去
	String checkUserResult = "";
	
	UserService us = new UserServiceImp();
	 
	public String getCheckUserResult() {
		return checkUserResult;
	}

	public void setCheckUserResult(String checkUserResult) {
		this.checkUserResult = checkUserResult;
	}

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
	
	public String checkUser() {
		String str = "checkUser";
		
		if(us.checkUser(user)) {
			checkUserResult = "用户名已存在！换一个啦！";
		}else {
			checkUserResult = "用户名不存在！可以使用！";
		}
		
		return str;
	}
	
}
