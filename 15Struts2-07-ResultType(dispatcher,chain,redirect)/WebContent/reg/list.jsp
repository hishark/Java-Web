<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>我只是给大家展示一下用户名！</title>
</head>
<body>

<!-- <% //略略略    %>这里头可以写java代码！ -->
用户名：<%=session.getAttribute("userName") %>

</body>
</html>