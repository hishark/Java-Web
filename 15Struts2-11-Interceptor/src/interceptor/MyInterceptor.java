package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/*
 * 拦截器需要定义 
 * 默认的那些拦截器都定义在struts-default.xml中 
 * 自定义拦截器要去struts.xml中定义
 */
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
		String str = "";

		// 执行action之前
		System.out.println("before action...");

		/*
		 * 进入action 唤醒action 此时系统流程进入action action中execute方法返回的字符串赋给这里的str
		 */
		str = action.invoke();

		// 执行action之后
		System.out.println("after action...");

		// str返回到struts.xml中根据action的result进行匹配
		return str;
	}

}
