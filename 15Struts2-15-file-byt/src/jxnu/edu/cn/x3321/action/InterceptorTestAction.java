package jxnu.edu.cn.x3321.action;

import com.opensymphony.xwork2.ActionSupport;

public class InterceptorTestAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String str="succ";
		System.out.println("in action...");
		return str;
	}
	

}
