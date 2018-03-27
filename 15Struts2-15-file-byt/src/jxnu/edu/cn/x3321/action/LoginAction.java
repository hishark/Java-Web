package jxnu.edu.cn.x3321.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import jxnu.edu.cn.x3321.bean.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	User user;	
	String saveCode;
	
	public String getSaveCode() {
		return saveCode;
	}

	public void setSaveCode(String saveCode) {
		this.saveCode = saveCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
		if(user.getUserName()==null||user.getUserName().equals("")){
			this.addFieldError("user.userName", "用户名不能为空!");
		}
		if(user.getPassWord()==null||user.getPassWord().equals("")){
			this.addFieldError("user.passWord", "密码不能为空！");
		}
		
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String str="loginSucc";

		String sc=(String)ServletActionContext.getRequest().getSession().getAttribute("rand");
		if(saveCode.equals(sc)){
			/*
			 * 验证用户名和密码
			 */

			System.out.println("in action ...userName is: "+user.getUserName());
			System.out.println("in action ...password is: "+user.getPassWord());
		    str="loginSucc";
		}
		System.out.println("in action ...savecode is: "+sc);
		System.out.println("in action ...savecode1 is: "+saveCode);	
		Map<String,Object> session=ActionContext.getContext().getSession();
		session.put("role",user.getUserName());
		return str;
	}
	
	

}
