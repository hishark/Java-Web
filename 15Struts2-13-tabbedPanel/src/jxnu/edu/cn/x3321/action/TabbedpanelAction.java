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
		 * 从数据库中取出数据（自己来做）略略略
		 */
		
		str = "三杨培训城市...";
		
		return strResult;
	}
	
	public String job() {
		String strResult = "succ";
		
		/*
		 * 从数据库中取出数据（自己来做）略略略
		 */
		
		str = "三杨就业...";
		
		return strResult;
	}
}
