<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<!-- 怎么把数据显示出来 这里用到ognl表达式？ -->
在loginResult.jsp中的用户名和密码是：
<!-- 括号里必须是login里的变量名 -->
${username}<br>
${password}
</body>
</html>