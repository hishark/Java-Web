<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!-- 该标签指令用于导入标签库  uri是导入东西的路径   prefix表示你用的标签必须是s开头-->
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<!-- action-表单里的数据提交给哪个action去处理  post-数据提交都用post，安全-->
<div align="center">
<s:form action="loginAction" method="post">
<s:textfield label="用户名" name="user.userName" title="请输入用户名！"/>
<s:password label="密    码" name="user.passWord" title="请输入密码！"/>

<!-- 验证码加下面两行 -->
<s:textfield label="验证码" name="VCode"></s:textfield>
<img id="VCode" src="/15Struts2-10-Wildcards/servlet.VCode">

<s:submit value="登    录"></s:submit>
<s:reset value="重    置"></s:reset>
</s:form>
</div>
</body>
</html>