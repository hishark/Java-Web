package jxnu.edu.cn.x3321.action;

import java.util.Map;

import jxnu.edu.cn.x3321.bean.User;
import jxnu.edu.cn.x3321.service.UserService;
import jxnu.edu.cn.x3321.serviceImpl.UserServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegAction extends ActionSupport {
	User user;
	String checkUserResult="";
	UserService us=new UserServiceImpl();

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
	
	public String reg(){
		String str="regSucc";
		/*
		 * 调用业务逻辑把user写到数据库
		 */
		Map<String,Object> session=ActionContext.getContext().getSession();
		session.put("userName",user.getUserName());
		System.out.print(user.getUserName());
		return str;
	}
	
	public String checkUser(){
		System.out.println("aaaaaaaaaaaaaa");
		String str="checkUser";
		
		if(us.checkUser(user)){
			checkUserResult="此用户名已经被使用，请换一个！";
		}else{
			checkUserResult="恭喜你！此用户名可以使用！";
		}
		
		return str;
	}

}
