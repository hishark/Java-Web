package jxnu.edu.cn.x3321.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	//��jsp�ı�����һ��
	//��ʵ��Ҫһ�� 
	//���Բ�һ�� ����getset������ı�����Ҫһ��
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
	
	//�Զ������������
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("����"+username+"����"+password);
		
		//return��structs.xml��
		return "loginSucc";
		
		//return super.execute();
	}
	
}
