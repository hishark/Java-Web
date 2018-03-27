<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<s:form action="loginAction" method="post">
  <s:textfield label="用户名" name="user.userName" title="请输入用户名！"/>
  <s:textfield label="密    码" name="user.passWord" title="请输入密码！"/>
  <s:textfield label="验证码" name="saveCode"/>
  <img id="saveCode" src="servlet.saveCode">
  <s:submit value="登录"/>
  <s:reset value="重置"/>
</s:form>
request.getParamter("userName");
</div>
</body>
</html>