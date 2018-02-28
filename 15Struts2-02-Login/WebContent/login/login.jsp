<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<!-- action-表单里的数据提交给哪个action去处理  post-数据提交都用post，安全-->
<div align="center">
<form action="loginAction" methid="post">
姓名：<input type="text" name="username">
密码：<input type="text" name="password">
<input type="submit" value="登录">
</form>
</div>
</body>
</html>