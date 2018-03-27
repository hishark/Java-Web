package jxnu.edu.cn.x3321.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import Service.UserService;
import ServiceImp.UserServiceImp;
import bean.User;

public class RegAction extends ActionSupport {

	User user;
	
	//�Ž�����ַ��� ���ص�ajaxresult.jsp��ȥ
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
	 * ����һ��ע��ķ���
	 */
	public String reg() {
		String str="regSucc";
		/*
		 * �����ݴ浽session
		 */
		Map<String,Object> session = ActionContext.getContext().getSession();
		session.put("userName", user.getUserName());
		//session�����û�����
		System.out.println(user.getUserName());
		return str;
	}
	
	public String checkUser() {
		String str = "checkUser";
		
		if(us.checkUser(user)) {
			checkUserResult = "�û����Ѵ��ڣ���һ������";
		}else {
			checkUserResult = "�û��������ڣ�����ʹ�ã�";
		}
		
		return str;
	}
	
}
