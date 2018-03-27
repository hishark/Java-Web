package jxnu.edu.cn.x3321.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation action) throws Exception {
		// TODO Auto-generated method stub
		String str="";
		
	    //执行action之前的代码---------------------------
		System.out.println("befor action....");		
		//进入action----------------------------
		str=action.invoke();
		//执行action之后的代码
		System.out.println("after action....");	
		return str;
	}

}
