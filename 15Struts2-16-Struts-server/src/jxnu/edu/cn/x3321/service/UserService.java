package jxnu.edu.cn.x3321.service;

import jxnu.edu.cn.x3321.bean.User;

public interface UserService {
	boolean checkUser(User user);
	
	//øÕªß∂À”√ﬂ’
	boolean loginCheck(String userName,String passWord);
}
