package jxnu.edu.cn.x3321.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoadDataAction extends ActionSupport {
	
	public String loadData(){
		String str="loadSucc";
		
		/*
		 * 从数据库取出数据
		 */
		Map<String,Object> session=ActionContext.getContext().getSession();
		System.out.println("loadDataAction ......:"+session.get("userName"));
		return str;
	}

}
