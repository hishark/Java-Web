package jxnu.edu.cn.x3321.action;

import com.opensymphony.xwork2.ActionSupport;

public class TabbedpanelAction extends ActionSupport {
	String str = "";

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public String train() {
		String strResult = "succ";
		
		/*
		 * �����ݿ���ȡ�����ݣ��Լ�������������
		 */
		
		str = "������ѵ����...";
		
		return strResult;
	}
	
	public String job() {
		String strResult = "succ";
		
		/*
		 * �����ݿ���ȡ�����ݣ��Լ�������������
		 */
		
		str = "�����ҵ...";
		
		return strResult;
	}
}
