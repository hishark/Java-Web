package interceptor;

import javax.servlet.Servlet;

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

	// 分调用之前、调用action、调用之后
	// 组件化 即插即用 可扩展性可维护性很强
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		String str = "";// 接受从action传来的字符串
		String role = "";// 角色
		
		// 从session中取得角色
		role = (String) ServletActionContext.getRequest().getSession().getAttribute("role");

		//判断是否是合法用户
		if (role != null && !role.equals("")) {
			//这里假设小添添是管理员哈哈哈哈哈哈
			if(role.equals("zzm")) {
				//唤醒action
				str = arg0.invoke();
			}else {
				System.out.println("你不是管理员别瞎按！");
				//记得在struts.xml中配置powerfail的result
				str = "powerfail";
			}
		}else {
			System.out.println("请登录！");
			//记得在struts.xml中配置loginfail的result
			str = "loginfail";
		}

		return str;
	}

}
