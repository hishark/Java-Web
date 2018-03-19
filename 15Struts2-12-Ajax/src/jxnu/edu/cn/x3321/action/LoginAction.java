package jxnu.edu.cn.x3321.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
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
		String str ="loginSucc";
		
		Map<String,Object> session = ActionContext.getContext().getSession();
		session.put("role", user.getUserName());
		
		
		return str;
		
		
	}

	/*
	 * 要得到user的数据
	 * 判断是否为空
	 */
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		//System.out.println(user.getUserName());
		if(user.getUserName()==null||user.getUserName().equals("")) {
			//返回给拦截器
			//把错误信息通过这个方法传给拦截器
			//拦截器拿到信息之后就传到第一个参数（出错的位置）
			this.addFieldError("user.userName", "用户名不能为空");
		}
		if(user.getPassWord()==null||user.getPassWord().equals("")) {
			this.addFieldError("user.passWord", "密码不能为空");
		}
		//super可要可不要 那就不要吧-。-
		//super.validate();
	}
	
	
	
}
