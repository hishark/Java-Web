package jxnu.edu.cn.x3321.action;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import jxnu.edu.cn.x3321.service.UserService;
import jxnu.edu.cn.x3321.serviceImpl.UserServiceImpl;
import net.sf.json.JSONObject;

public class LoginActivityAction extends ActionSupport {
	/*
	 * �û���������
	 */
	String userName;
	String passWord;
	
	UserService us = new UserServiceImpl();
	
	/*
	 * �õ�response����,ͨ���������Ӧ�ͻ��˵����� ����JSON���ظ��ͻ��ˣ�
	 */
	HttpServletResponse response = ServletActionContext.getResponse();
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	/*
	 * û�з���ֵ������void��
	 * ����ͻ���LoginActivity�����ĵ�¼��Ϣ
	 * �ɹ����ɹ�����Ϣȫ��JSON����
	 * ����Ҫ��֮ǰһ�������ַ���ɶ��
	 */
	public void loginActivity() {
		/*
		 * �����JSONObject�Ϳͻ��˵�JSONObject���Ĳ���ͬһ����
		 */
		JSONObject jsonObject = new JSONObject();
		
		if(us.loginCheck(userName, passWord)) {
			jsonObject.put("message", "��ӭ"+userName+"��λ���ѣ�");
		}else {
			jsonObject.put("message", "�ϸ���˭������");
		}

		/*
		 * �ȷ�װ��text���ַ��� ��ת����JSON
		 * ��׿Activity��������ʾֻ��UTF-8��GBK������Ŷ
		 * ������ָ�ڿͻ�����ʾ�ı����ʽ
		 */
		response.setContentType("text/json;charset=utf-8");
		
		/*
		 * ������ָ�����紫������еı��뷽ʽ
		 */
		response.setCharacterEncoding("utf-8");
		
		/*
		 * �ùܵ�����������
		 * ��JSONת����byte�ٴ�
		 * ���뷽ʽUTF-8��
		 */
		try {
			byte[] bytes = jsonObject.toString().getBytes("utf-8");
			
			//���ֽ�����д�������
			response.getOutputStream().write(bytes);
			
			//���ô������ݵĳ��ȣ�����response����
			response.setContentLength(bytes.length);
			
			//��ջ��棨�ѻ������ȫ������ȥ
			response.getOutputStream().flush();
			
			//����Ҫ����
			response.getOutputStream().close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}
}
