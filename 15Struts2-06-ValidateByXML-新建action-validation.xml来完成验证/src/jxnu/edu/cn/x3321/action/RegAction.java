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
	 * ����һ��ע��ķ���
	 */
	public String reg() {
		String str="regSucc";
		/*
		 * ����ҵ���߼���userд�����ݿ�
		 */
		System.out.println(user.getUserName());
		return str;
	}
}
