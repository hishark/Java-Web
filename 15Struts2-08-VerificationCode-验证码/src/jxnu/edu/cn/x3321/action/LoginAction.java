package jxnu.edu.cn.x3321.action;

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

	//�Զ������������
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("����"+user.getUserName()+"����"+user.getPassWord());
		//return��structs.xml��
		return "loginSucc";
		
		//return super.execute();
	}

	/*
	 * Ҫ�õ�user������
	 * �ж��Ƿ�Ϊ��
	 */
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		//System.out.println(user.getUserName());
		if(user.getUserName()==null||user.getUserName().equals("")) {
			//���ظ�������
			//�Ѵ�����Ϣͨ�������������������
			//�������õ���Ϣ֮��ʹ�����һ�������������λ�ã�
			this.addFieldError("user.userName", "�û�������Ϊ��");
		}
		if(user.getPassWord()==null||user.getPassWord().equals("")) {
			this.addFieldError("user.passWord", "���벻��Ϊ��");
		}
		//super��Ҫ�ɲ�Ҫ �ǾͲ�Ҫ��-��-
		//super.validate();
	}
	
	
	
}
