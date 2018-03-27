package jxnu.edu.cn.x3321.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class InterceptorPower implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
	     String str="";
	     String role="";
	     role=(String)ServletActionContext.getRequest().getSession().getAttribute("role");
		 if(role!=null&&!role.equals("")){
			 if(role.equals("zzm")){
				 str=arg0.invoke();
			 }else{
				 System.out.println("你不是管理员！");
				 str="powerfail";
			 }
		 }else{
			 System.out.println("请登录！");
			 str="loginfail";
		 }
	     return str;
	}

}
