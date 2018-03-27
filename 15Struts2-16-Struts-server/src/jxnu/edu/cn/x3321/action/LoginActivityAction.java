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
	 * 用户名和密码
	 */
	String userName;
	String passWord;
	
	UserService us = new UserServiceImpl();
	
	/*
	 * 得到response对象,通过这个来响应客户端的请求 （把JSON返回给客户端）
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
	 * 没有返回值啦！是void！
	 * 处理客户端LoginActivity过来的登录信息
	 * 成功不成功的信息全靠JSON传递
	 * 不需要跟之前一样返回字符串啥的
	 */
	public void loginActivity() {
		/*
		 * 这里的JSONObject和客户端的JSONObject导的不是同一个包
		 */
		JSONObject jsonObject = new JSONObject();
		
		if(us.loginCheck(userName, passWord)) {
			jsonObject.put("message", "欢迎"+userName+"这位胖友！");
		}else {
			jsonObject.put("message", "老哥你谁？？？");
		}

		/*
		 * 先封装成text即字符串 再转换成JSON
		 * 安卓Activity的中文显示只认UTF-8！GBK不可以哦
		 * 这里是指在客户端显示的编码格式
		 */
		response.setContentType("text/json;charset=utf-8");
		
		/*
		 * 这里是指在网络传输过程中的编码方式
		 */
		response.setCharacterEncoding("utf-8");
		
		/*
		 * 用管道流传东西啦
		 * 把JSON转换成byte再传
		 * 编码方式UTF-8！
		 */
		try {
			byte[] bytes = jsonObject.toString().getBytes("utf-8");
			
			//把字节数组写入输出流
			response.getOutputStream().write(bytes);
			
			//设置传输内容的长度，方便response处理
			response.setContentLength(bytes.length);
			
			//清空缓存（把缓存里的全部发出去
			response.getOutputStream().flush();
			
			//用完要关啦
			response.getOutputStream().close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
	}
}
