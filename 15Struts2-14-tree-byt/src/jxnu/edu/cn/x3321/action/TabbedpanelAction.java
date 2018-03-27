package jxnu.edu.cn.x3321.action;

import com.opensymphony.xwork2.ActionSupport;

public class TabbedpanelAction extends ActionSupport {
	String str="";

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public String train(){
		String strResult="succ";
		
		/*
		 * 从数据库取数据
		 */
		str="三杨培训的城市。。。。。";
		
		return strResult;
	}
	
	public String job(){
		String strResult="succ";
		
		/*
		 * 从数据库取数据
		 */
		str="三杨就业的城市。。。。。";
		
		return strResult;
	}

}
